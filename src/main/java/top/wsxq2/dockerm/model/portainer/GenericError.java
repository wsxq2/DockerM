package top.wsxq2.dockerm.model.portainer;

public class GenericError {
    private final String err;

    public GenericError(String err) {
        this.err = err;
    }

    public String getErr() {
        return err;
    }

    @Override
    public String toString() {
        return "GenericError{" +
                "err='" + err + '\'' +
                '}';
    }

}
