
package top.wsxq2.dockerm.model.docker.container;


public class BlkioWeightDevice {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlkioWeightDevice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
