package main;

public abstract class IObject {
    public IObject eval(ICode code) {
        return ISystem.eval(this, code);
    }

    abstract public IObject invoke(IObject contextObject, String methodName, IObject... args);
}
