package main;

public class IfObject extends IObject {
    public IObject eval(ICode code) {
        return IObjectRepository.NOTHING_OBJECT;
    }

    public IObject invoke(IObject contextObject, String methodName, IObject... args) {
        // args[0] - condition
        // args[1] - ifTrue
        // args[2] - ifFalse

        ICode condition = (ICode) args[0];
        ICode ifTrue = (ICode) args[1];
        ICode ifFalse = (ICode) args[2];

        IObject conditionResult = contextObject.eval(condition);

        IObject result = IObjectRepository.NOTHING_OBJECT;

        if (conditionResult == IObjectRepository.TRUE_OBJECT) {
            result = contextObject.eval(ifTrue);
        }

        if (conditionResult == IObjectRepository.FALSE_OBJECT) {
            result = contextObject.eval(ifFalse);
        }

        return result;
    }
}
