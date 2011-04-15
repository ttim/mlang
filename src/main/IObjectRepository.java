package main;

public class IObjectRepository {
    public static final IObject NOTHING_OBJECT = new NothingObject();
    public static final IObject TRUE_OBJECT = new NothingObject();
    public static final IObject FALSE_OBJECT = new NothingObject();

    public static final IObject IF_OBJECT = new IfObject();
}
