package org.litespring.beans;

/**
 * Exception:属于要check的异常，需要进行try-catch处理或者往上throws
 * RuntimeException：属于uncheck异常，不需要处理
 */
public class BeansException extends RuntimeException {
	public BeansException(String msg) {
		super(msg);	}

	public BeansException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
