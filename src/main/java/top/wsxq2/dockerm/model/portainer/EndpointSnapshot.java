package top.wsxq2.dockerm.model.portainer;

public class EndpointSnapshot {
    String dockerVersion;
    int healthyContainerCount;
    int imageCount;
    int runningContainerCount;
    int serviceCount;
    Object snapshotRaw;
    int stackCount;
    int stoppedContainerCount;
    boolean swarm;
    int time;
    int totalCPU;
    int totalMemory;
    int unhealthyContainerCount;
    int volumeCount;

    public EndpointSnapshot(String dockerVersion, int healthyContainerCount, int imageCount,
                            int runningContainerCount, int serviceCount, Object snapshotRaw, int stackCount,
                            int stoppedContainerCount, boolean swarm, int time, int totalCPU, int totalMemory,
                            int unhealthyContainerCount, int volumeCount) {
        this.dockerVersion = dockerVersion;
        this.healthyContainerCount = healthyContainerCount;
        this.imageCount = imageCount;
        this.runningContainerCount = runningContainerCount;
        this.serviceCount = serviceCount;
        this.snapshotRaw = snapshotRaw;
        this.stackCount = stackCount;
        this.stoppedContainerCount = stoppedContainerCount;
        this.swarm = swarm;
        this.time = time;
        this.totalCPU = totalCPU;
        this.totalMemory = totalMemory;
        this.unhealthyContainerCount = unhealthyContainerCount;
        this.volumeCount = volumeCount;
    }

    public String getDockerVersion() {
        return dockerVersion;
    }

    public int getHealthyContainerCount() {
        return healthyContainerCount;
    }

    public int getImageCount() {
        return imageCount;
    }

    public int getRunningContainerCount() {
        return runningContainerCount;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    public Object getSnapshotRaw() {
        return snapshotRaw;
    }

    public int getStackCount() {
        return stackCount;
    }

    public int getStoppedContainerCount() {
        return stoppedContainerCount;
    }

    public boolean isSwarm() {
        return swarm;
    }

    public int getTime() {
        return time;
    }

    public int getTotalCPU() {
        return totalCPU;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public int getUnhealthyContainerCount() {
        return unhealthyContainerCount;
    }

    public int getVolumeCount() {
        return volumeCount;
    }

    @Override
    public String toString() {
        return "EndpointSnapshot{" +
                "dockerVersion='" + dockerVersion + '\'' +
                ", healthyContainerCount=" + healthyContainerCount +
                ", imageCount=" + imageCount +
                ", runningContainerCount=" + runningContainerCount +
                ", serviceCount=" + serviceCount +
                ", snapshotRaw=" + snapshotRaw +
                ", stackCount=" + stackCount +
                ", stoppedContainerCount=" + stoppedContainerCount +
                ", swarm=" + swarm +
                ", time=" + time +
                ", totalCPU=" + totalCPU +
                ", totalMemory=" + totalMemory +
                ", unhealthyContainerCount=" + unhealthyContainerCount +
                ", volumeCount=" + volumeCount +
                '}';
    }
}
