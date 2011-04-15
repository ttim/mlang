package main;

public class NothingObject extends IObject {
    @Override
    public IObject invoke(IObject contextObject, String methodName, IObject... args) {
        return IObjectRepository.NOTHING_OBJECT;
    }

    @Override
    public IObject eval(ICode code) {
        return IObjectRepository.NOTHING_OBJECT;
    }
}
