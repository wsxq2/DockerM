
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HostConfig {

    @SerializedName("MaximumIOps")
    @Expose
    private Integer maximumIOps;
    @SerializedName("MaximumIOBps")
    @Expose
    private Integer maximumIOBps;
    @SerializedName("BlkioWeight")
    @Expose
    private Integer blkioWeight;
    @SerializedName("BlkioWeightDevice")
    @Expose
    private List<BlkioWeightDevice> blkioWeightDevice = new ArrayList<BlkioWeightDevice>();
    @SerializedName("BlkioDeviceReadBps")
    @Expose
    private List<BlkioDeviceReadBp> blkioDeviceReadBps = new ArrayList<BlkioDeviceReadBp>();
    @SerializedName("BlkioDeviceWriteBps")
    @Expose
    private List<BlkioDeviceWriteBp> blkioDeviceWriteBps = new ArrayList<BlkioDeviceWriteBp>();
    @SerializedName("BlkioDeviceReadIOps")
    @Expose
    private List<BlkioDeviceReadIOp> blkioDeviceReadIOps = new ArrayList<BlkioDeviceReadIOp>();
    @SerializedName("BlkioDeviceWriteIOps")
    @Expose
    private List<BlkioDeviceWriteIOp> blkioDeviceWriteIOps = new ArrayList<BlkioDeviceWriteIOp>();
    @SerializedName("ContainerIDFile")
    @Expose
    private String containerIDFile;
    @SerializedName("CpusetCpus")
    @Expose
    private String cpusetCpus;
    @SerializedName("CpusetMems")
    @Expose
    private String cpusetMems;
    @SerializedName("CpuPercent")
    @Expose
    private Integer cpuPercent;
    @SerializedName("CpuShares")
    @Expose
    private Integer cpuShares;
    @SerializedName("CpuPeriod")
    @Expose
    private Integer cpuPeriod;
    @SerializedName("CpuRealtimePeriod")
    @Expose
    private Integer cpuRealtimePeriod;
    @SerializedName("CpuRealtimeRuntime")
    @Expose
    private Integer cpuRealtimeRuntime;
    @SerializedName("Devices")
    @Expose
    private List<Object> devices = new ArrayList<Object>();
    @SerializedName("IpcMode")
    @Expose
    private String ipcMode;
    @SerializedName("LxcConf")
    @Expose
    private List<Object> lxcConf = new ArrayList<Object>();
    @SerializedName("Memory")
    @Expose
    private Integer memory;
    @SerializedName("MemorySwap")
    @Expose
    private Integer memorySwap;
    @SerializedName("MemoryReservation")
    @Expose
    private Integer memoryReservation;
    @SerializedName("KernelMemory")
    @Expose
    private Integer kernelMemory;
    @SerializedName("OomKillDisable")
    @Expose
    private Boolean oomKillDisable;
    @SerializedName("OomScoreAdj")
    @Expose
    private Integer oomScoreAdj;
    @SerializedName("NetworkMode")
    @Expose
    private String networkMode;
    @SerializedName("PidMode")
    @Expose
    private String pidMode;
    @SerializedName("PortBindings")
    @Expose
    private PortBindings portBindings;
    @SerializedName("Privileged")
    @Expose
    private Boolean privileged;
    @SerializedName("ReadonlyRootfs")
    @Expose
    private Boolean readonlyRootfs;
    @SerializedName("PublishAllPorts")
    @Expose
    private Boolean publishAllPorts;
    @SerializedName("RestartPolicy")
    @Expose
    private RestartPolicy restartPolicy;
    @SerializedName("LogConfig")
    @Expose
    private LogConfig logConfig;
    @SerializedName("Sysctls")
    @Expose
    private Sysctls sysctls;
    @SerializedName("Ulimits")
    @Expose
    private List<Ulimit> ulimits = new ArrayList<Ulimit>();
    @SerializedName("VolumeDriver")
    @Expose
    private String volumeDriver;
    @SerializedName("ShmSize")
    @Expose
    private Integer shmSize;

    public Integer getMaximumIOps() {
        return maximumIOps;
    }

    public Integer getMaximumIOBps() {
        return maximumIOBps;
    }

    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public List<BlkioWeightDevice> getBlkioWeightDevice() {
        return blkioWeightDevice;
    }

    public List<BlkioDeviceReadBp> getBlkioDeviceReadBps() {
        return blkioDeviceReadBps;
    }

    public List<BlkioDeviceWriteBp> getBlkioDeviceWriteBps() {
        return blkioDeviceWriteBps;
    }

    public List<BlkioDeviceReadIOp> getBlkioDeviceReadIOps() {
        return blkioDeviceReadIOps;
    }

    public List<BlkioDeviceWriteIOp> getBlkioDeviceWriteIOps() {
        return blkioDeviceWriteIOps;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public Integer getCpuPercent() {
        return cpuPercent;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public Integer getCpuPeriod() {
        return cpuPeriod;
    }

    public Integer getCpuRealtimePeriod() {
        return cpuRealtimePeriod;
    }

    public Integer getCpuRealtimeRuntime() {
        return cpuRealtimeRuntime;
    }

    public List<Object> getDevices() {
        return devices;
    }

    public String getIpcMode() {
        return ipcMode;
    }

    public List<Object> getLxcConf() {
        return lxcConf;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getMemorySwap() {
        return memorySwap;
    }

    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    public Integer getKernelMemory() {
        return kernelMemory;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public Integer getOomScoreAdj() {
        return oomScoreAdj;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public String getPidMode() {
        return pidMode;
    }

    public PortBindings getPortBindings() {
        return portBindings;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public LogConfig getLogConfig() {
        return logConfig;
    }

    public Sysctls getSysctls() {
        return sysctls;
    }

    public List<Ulimit> getUlimits() {
        return ulimits;
    }

    public String getVolumeDriver() {
        return volumeDriver;
    }

    public Integer getShmSize() {
        return shmSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maximumIOps");
        sb.append('=');
        sb.append(((this.maximumIOps == null) ? "<null>" : this.maximumIOps));
        sb.append(',');
        sb.append("maximumIOBps");
        sb.append('=');
        sb.append(((this.maximumIOBps == null) ? "<null>" : this.maximumIOBps));
        sb.append(',');
        sb.append("blkioWeight");
        sb.append('=');
        sb.append(((this.blkioWeight == null) ? "<null>" : this.blkioWeight));
        sb.append(',');
        sb.append("blkioWeightDevice");
        sb.append('=');
        sb.append(((this.blkioWeightDevice == null) ? "<null>" : this.blkioWeightDevice));
        sb.append(',');
        sb.append("blkioDeviceReadBps");
        sb.append('=');
        sb.append(((this.blkioDeviceReadBps == null) ? "<null>" : this.blkioDeviceReadBps));
        sb.append(',');
        sb.append("blkioDeviceWriteBps");
        sb.append('=');
        sb.append(((this.blkioDeviceWriteBps == null) ? "<null>" : this.blkioDeviceWriteBps));
        sb.append(',');
        sb.append("blkioDeviceReadIOps");
        sb.append('=');
        sb.append(((this.blkioDeviceReadIOps == null) ? "<null>" : this.blkioDeviceReadIOps));
        sb.append(',');
        sb.append("blkioDeviceWriteIOps");
        sb.append('=');
        sb.append(((this.blkioDeviceWriteIOps == null) ? "<null>" : this.blkioDeviceWriteIOps));
        sb.append(',');
        sb.append("containerIDFile");
        sb.append('=');
        sb.append(((this.containerIDFile == null) ? "<null>" : this.containerIDFile));
        sb.append(',');
        sb.append("cpusetCpus");
        sb.append('=');
        sb.append(((this.cpusetCpus == null) ? "<null>" : this.cpusetCpus));
        sb.append(',');
        sb.append("cpusetMems");
        sb.append('=');
        sb.append(((this.cpusetMems == null) ? "<null>" : this.cpusetMems));
        sb.append(',');
        sb.append("cpuPercent");
        sb.append('=');
        sb.append(((this.cpuPercent == null) ? "<null>" : this.cpuPercent));
        sb.append(',');
        sb.append("cpuShares");
        sb.append('=');
        sb.append(((this.cpuShares == null) ? "<null>" : this.cpuShares));
        sb.append(',');
        sb.append("cpuPeriod");
        sb.append('=');
        sb.append(((this.cpuPeriod == null) ? "<null>" : this.cpuPeriod));
        sb.append(',');
        sb.append("cpuRealtimePeriod");
        sb.append('=');
        sb.append(((this.cpuRealtimePeriod == null) ? "<null>" : this.cpuRealtimePeriod));
        sb.append(',');
        sb.append("cpuRealtimeRuntime");
        sb.append('=');
        sb.append(((this.cpuRealtimeRuntime == null) ? "<null>" : this.cpuRealtimeRuntime));
        sb.append(',');
        sb.append("devices");
        sb.append('=');
        sb.append(((this.devices == null) ? "<null>" : this.devices));
        sb.append(',');
        sb.append("ipcMode");
        sb.append('=');
        sb.append(((this.ipcMode == null) ? "<null>" : this.ipcMode));
        sb.append(',');
        sb.append("lxcConf");
        sb.append('=');
        sb.append(((this.lxcConf == null) ? "<null>" : this.lxcConf));
        sb.append(',');
        sb.append("memory");
        sb.append('=');
        sb.append(((this.memory == null) ? "<null>" : this.memory));
        sb.append(',');
        sb.append("memorySwap");
        sb.append('=');
        sb.append(((this.memorySwap == null) ? "<null>" : this.memorySwap));
        sb.append(',');
        sb.append("memoryReservation");
        sb.append('=');
        sb.append(((this.memoryReservation == null) ? "<null>" : this.memoryReservation));
        sb.append(',');
        sb.append("kernelMemory");
        sb.append('=');
        sb.append(((this.kernelMemory == null) ? "<null>" : this.kernelMemory));
        sb.append(',');
        sb.append("oomKillDisable");
        sb.append('=');
        sb.append(((this.oomKillDisable == null) ? "<null>" : this.oomKillDisable));
        sb.append(',');
        sb.append("oomScoreAdj");
        sb.append('=');
        sb.append(((this.oomScoreAdj == null) ? "<null>" : this.oomScoreAdj));
        sb.append(',');
        sb.append("networkMode");
        sb.append('=');
        sb.append(((this.networkMode == null) ? "<null>" : this.networkMode));
        sb.append(',');
        sb.append("pidMode");
        sb.append('=');
        sb.append(((this.pidMode == null) ? "<null>" : this.pidMode));
        sb.append(',');
        sb.append("portBindings");
        sb.append('=');
        sb.append(((this.portBindings == null) ? "<null>" : this.portBindings));
        sb.append(',');
        sb.append("privileged");
        sb.append('=');
        sb.append(((this.privileged == null) ? "<null>" : this.privileged));
        sb.append(',');
        sb.append("readonlyRootfs");
        sb.append('=');
        sb.append(((this.readonlyRootfs == null) ? "<null>" : this.readonlyRootfs));
        sb.append(',');
        sb.append("publishAllPorts");
        sb.append('=');
        sb.append(((this.publishAllPorts == null) ? "<null>" : this.publishAllPorts));
        sb.append(',');
        sb.append("restartPolicy");
        sb.append('=');
        sb.append(((this.restartPolicy == null) ? "<null>" : this.restartPolicy));
        sb.append(',');
        sb.append("logConfig");
        sb.append('=');
        sb.append(((this.logConfig == null) ? "<null>" : this.logConfig));
        sb.append(',');
        sb.append("sysctls");
        sb.append('=');
        sb.append(((this.sysctls == null) ? "<null>" : this.sysctls));
        sb.append(',');
        sb.append("ulimits");
        sb.append('=');
        sb.append(((this.ulimits == null) ? "<null>" : this.ulimits));
        sb.append(',');
        sb.append("volumeDriver");
        sb.append('=');
        sb.append(((this.volumeDriver == null) ? "<null>" : this.volumeDriver));
        sb.append(',');
        sb.append("shmSize");
        sb.append('=');
        sb.append(((this.shmSize == null) ? "<null>" : this.shmSize));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
