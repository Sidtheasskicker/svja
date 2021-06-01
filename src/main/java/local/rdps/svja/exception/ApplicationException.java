package local.rdps.svja.exception;

import java.util.Objects;

import org.apache.logging.log4j.Level;

import local.rdps.svja.constant.CommonConstants;
import local.rdps.svja.constant.ErrorConstants;
import local.rdps.svja.constant.ResultConstants;
import local.rdps.svja.util.Sequence;
import local.rdps.svja.util.ValidationUtils;

/**
 * <p>
 * This class represents a generic exception that has been generated by SVJA (this should be a <em>very</em>
 * <strong>rare</strong> case), forwarded by SVJA, or repackaged by SVJA. More often than not, there are better
 * exceptions to be used than this or a new exception should be created rather than use this.
 * </p>
 *
 * @author DaRon
 * @since 1.0
 */
public class ApplicationException extends Exception {
	private static final String at = "at ";
	private static final String nativeMethod = "(Native Method)";
	private static final long serialVersionUID = 1000000L;
	private static final String unknownLine = "Unknown Line";
	private static final String unknownSource = "(Unknown Source)";
	private byte stackTraceLogDirective = ErrorConstants.LOG_STACK_TRACE_WITH_EXCEPTION;
	private String uiMessage;

	/**
	 * <p>
	 * This method takes a {@link StackTraceElement} and turns it into a string that can be printed as part of a
	 * call-stack read-out.
	 * </p>
	 *
	 * @param item
	 *            The StackTraceElement to stringify
	 * @return A {@link String} composed of the pieces of the {@link StackTraceElement}
	 */
	private static String stackTraceElementToString(final StackTraceElement item) {
		final StringBuilder sb = new StringBuilder(128);
		sb.append(System.lineSeparator()).append(ApplicationException.at).append(item.getClassName()).append('.')
				.append(item.getMethodName());
		if (item.isNativeMethod()) {
			sb.append(ApplicationException.nativeMethod);
		}
		final String fileName = item.getFileName();
		if (Objects.nonNull(fileName)) {
			sb.append('(').append(fileName).append(':');
			if (item.getLineNumber() >= 0) {
				sb.append(item.getLineNumber());
			} else {
				sb.append(ApplicationException.unknownLine);
			}
			sb.append(')');
		} else {
			sb.append(ApplicationException.unknownSource);
		}

		return sb.toString();
	}

	/**
	 * <p>
	 * Create a new instance with some data of interest for the message.
	 * </p>
	 */
	public ApplicationException() {
		super();
	}

	/**
	 * <p>
	 * Create a new instance with the passed in message. We add some data of interest to the message.
	 * </p>
	 *
	 * @param message
	 *            The reasoning behind the exception
	 */
	public ApplicationException(final String message) {
		super(ValidationUtils.isEmpty(message) ? CommonConstants.EMPTY_STRING : message);
	}

	/**
	 * <p>
	 * Create a new instance with the passed in message and the UI message.
	 * </p>
	 *
	 * @param message
	 *            The reasoning behind the exception
	 * @param uiMessage
	 *            The uiMessage is text that will be exposed to the UI
	 * @since 2.8
	 */
	public ApplicationException(final String message, final String uiMessage) {
		super(ValidationUtils.isEmpty(message) ? CommonConstants.EMPTY_STRING : message);
		this.uiMessage = uiMessage;
	}

	/**
	 * <p>
	 * Create a new instance with the passed in message and the exception. We add some data of interest to the message.
	 * </p>
	 *
	 * @param message
	 *            The reasoning behind the exception
	 * @param cause
	 *            The exception from which it was spawned
	 */
	public ApplicationException(final String message, final Throwable cause) {
		super(ValidationUtils.isEmpty(message) ? CommonConstants.EMPTY_STRING : message, cause);
	}

	/**
	 * <p>
	 * Returns a limited stack with the default limits for the exception.
	 * </p>
	 *
	 * @return The limited stack
	 */
	protected String getLimitedStack() {
		return getLimitedStack(4);
	}

	/**
	 * <p>
	 * Returns a limited stack with at most {@code maxLevel} stack trace elements.
	 * </p>
	 *
	 * @param maxLevel
	 *            The most elements of the trace to return
	 * @return The limited stack
	 */
	protected String getLimitedStack(final int maxLevel) {
		final StringBuilder sb = new StringBuilder(128);
		final StackTraceElement[] trace = getStackTrace();

		if (Objects.isNull(trace))
			return "The stack trace is missing!";
		if (trace.length < 1)
			return "The stack trace is empty!";

		// Create the trace
		Sequence.stream(0, Math.min(trace.length, Math.max(1, maxLevel)) - 1).mapToObj(i -> trace[i])
				.forEach(ApplicationException::stackTraceElementToString);

		return sb.toString();
	}

	/**
	 * <p>
	 * This method returns the exception's Struts return value String, should the exception not be caught before the
	 * BaseInterceptor. This String is used by Struts to make flow decisions, so should either be a global directive or
	 * a local (action-specific) directive. Please see {@link ResultConstants} for the global Strings and review the
	 * struts configuration file (struts.xml) if you are unsure about the proper value for this String or the flow that
	 * this value will cause the action to take.
	 * </p>
	 *
	 * @return A known String value for the Struts action, for which Struts has a path
	 */
	@SuppressWarnings("static-method")
	public String getExceptionReturnString() {
		return ResultConstants.RESULT_ERROR_GLOBAL;
	}

	/**
	 * <p>
	 * This method returns the exception's HTTP response status code that is sent to the client if the request is not
	 * caught before the BaseInterceptor. Please see {@link "http://en.wikipedia.org/wiki/List_of_HTTP_status_codes"}
	 * for a list of status codes and their meaning.
	 * </p>
	 *
	 * @return A valid HTTP response status code
	 */
	@SuppressWarnings("static-method")
	public int getExceptionStatusCode() {
		return 500;
	}

	/**
	 * <p>
	 * The "pretty" title for the exception, which is displayed in the logs to make it easily identifiable.
	 * </p>
	 *
	 * @return A unique, "pretty" title for the exception
	 */
	@SuppressWarnings("static-method")
	public String getExceptionTitle() {
		return "General Application Exception";
	}

	/**
	 * <p>
	 * This method returns a limited (subset) stack trace, allowing the extraction of only the most important pieces of
	 * the stack trace, as defined by the specific exception.
	 * </p>
	 *
	 * @return A String containing the most important parts of the stack trace
	 */
	public String getLimitedStackTrace() {
		return getLimitedStack();
	}

	/**
	 * <p>
	 * This method returns the level at which the logger should log the exception.
	 * </p>
	 *
	 * @return The level at which the error should be logged by the Logger
	 */
	@SuppressWarnings("static-method")
	public Level getLogLevel() {
		return Level.ERROR;
	}

	/**
	 * <p>
	 * This method determines whether or not the stack trace should be logged in the same message as the exception or at
	 * all.
	 * </p>
	 *
	 * @return A byte indicating the level and point at which the stack trace should be logged
	 */
	public byte getStackTraceLogDirective() {
		return this.stackTraceLogDirective;
	}

	/**
	 * <p>
	 * Retrieve the initial message that cause this error.
	 * </p>
	 *
	 * @return initialMessage The message that was first throw without any additional information
	 */
	public String getUiMessage() {
		return this.uiMessage;
	}

	/**
	 * <p>
	 * Sets the stack trace log directive.
	 * </p>
	 *
	 * @param stackTraceLogDirective
	 *            The value for the stackTraceLogDirective
	 */
	public void setStackTraceLogDirective(final byte stackTraceLogDirective) {
		this.stackTraceLogDirective = stackTraceLogDirective;
	}
}