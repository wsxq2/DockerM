package top.wsxq2.dockerm.model.portainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class DataItem {
    @SerializedName(value = "Id", alternate = "ID")
    @Expose
    private int id;

    public DataItem(int id) {
        this.id = id;
    }

    protected DataItem() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "id=" + id +
                '}';
    }
}
