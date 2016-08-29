package com.qefee.pj.elog;

/**
 * ELogStrategy.
 * <ul>
 * <li>date: 16/8/29</li>
 * </ul>
 *
 * @author tongjin
 */
public class ELogStrategy {

    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_V = new ELogStrategy(true, false, false, false, false, false);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_D = new ELogStrategy(false, true, false, false, false, false);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_I = new ELogStrategy(false, false, true, false, false, false);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_W = new ELogStrategy(false, false, false, true, false, false);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_E = new ELogStrategy(false, false, false, false, true, false);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ONLY_A = new ELogStrategy(false, false, false, false, false, true);

    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_V = new ELogStrategy(true, true, true, true, true, true);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_D = new ELogStrategy(false, true, true, true, true, true);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_I = new ELogStrategy(false, false, true, true, true, true);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_W = new ELogStrategy(false, false, false, true, true, true);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_E = new ELogStrategy(false, false, false, false, true, true);
    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ABOVE_A = new ELogStrategy(false, false, false, false, false, true);

    /**
     * ELogStrategy. same to {@link #ABOVE_V}
     * <ul>
     *     <li>{@link #v}: true</li>
     *     <li>{@link #d}: true</li>
     *     <li>{@link #i}: true</li>
     *     <li>{@link #w}: true</li>
     *     <li>{@link #e}: true</li>
     *     <li>{@link #a}: true</li>
     * </ul>
     */
    public static final ELogStrategy ALL = ELogStrategy.ABOVE_V;

    /**
     * ELogStrategy.
     * <ul>
     *     <li>{@link #v}: false</li>
     *     <li>{@link #d}: false</li>
     *     <li>{@link #i}: false</li>
     *     <li>{@link #w}: false</li>
     *     <li>{@link #e}: false</li>
     *     <li>{@link #a}: false</li>
     * </ul>
     */
    public static final ELogStrategy NONE = new ELogStrategy(false, false, false, false, false, false);

    /** verbose */
    public boolean v;
    /** debug */
    public boolean d;
    /** info */
    public boolean i;
    /** warning */
    public boolean w;
    /** error */
    public boolean e;
    /** assert */
    public boolean a;

    /**
     * constructor
     * @param v verbose
     * @param d debug
     * @param i info
     * @param w warning
     * @param e error
     * @param a assert
     */
    public ELogStrategy(boolean v, boolean d, boolean i, boolean w, boolean e, boolean a) {
        this.v = v;
        this.d = d;
        this.i = i;
        this.w = w;
        this.e = e;
        this.a = a;
    }
}
