package com.qefee.pj.elog;

import android.util.Log;

/**
 * ELog.
 * <ul>
 * <li>date: 16/8/29</li>
 * </ul>
 *
 * @author tongjin
 */
public class ELog {

    private ELog() {
    }

    /**
     * ELogStrategy.
     */
    private static ELogStrategy strategy = ELogStrategy.ALL;

    /**
     * set ELogStrategy.
     * @param strategy ELogStrategy
     */
    public static void setStrategy(ELogStrategy strategy) {
        ELog.strategy = strategy;
    }

    /**
     * Send a {@link Log#VERBOSE} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int v(String tag, String msg) {
        if (strategy.v) {
            return Log.v(tag, msg);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#VERBOSE} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int v(String tag, String msg, Throwable tr) {
        if (strategy.v) {
        return Log.v(tag, msg, tr);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#DEBUG} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int d(String tag, String msg) {
        if (strategy.d) {
            return Log.d(tag, msg);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#DEBUG} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int d(String tag, String msg, Throwable tr) {
        if (strategy.d) {
            return Log.d(tag, msg, tr);
        } else {
            return -1;
        }
    }

    /**
     * Send an {@link Log#INFO} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int i(String tag, String msg) {
        if (strategy.i) {
            return Log.i(tag, msg);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#INFO} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int i(String tag, String msg, Throwable tr) {
        if (strategy.i) {
            return Log.i(tag, msg, tr);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#WARN} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int w(String tag, String msg) {
        if (strategy.w) {
            return Log.w(tag, msg);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int w(String tag, String msg, Throwable tr) {
        if (strategy.w) {
            return Log.w(tag, msg, tr);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param tr An exception to log
     */
    public static int w(String tag, Throwable tr) {
        if (strategy.w) {
            return Log.w(tag, tr);
        } else {
            return -1;
        }
    }

    /**
     * Send an {@link Log#ERROR} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int e(String tag, String msg) {
        if (strategy.e) {
            return Log.e(tag, msg);
        } else {
            return -1;
        }
    }

    /**
     * Send a {@link Log#ERROR} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int e(String tag, String msg, Throwable tr) {
        if (strategy.e) {
            return Log.e(tag, msg, tr);
        } else {
            return -1;
        }
    }
}
