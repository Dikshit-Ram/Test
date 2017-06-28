package io.egen.training.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Transient;

import java.util.*;

@Data
public class Tires{
    private byte frontLeft;
    private byte frontRight;
    private byte rearLeft;
    private byte rearRight;

    @Transient
    @JsonIgnore
    public List<Byte> getTirePressures() {
        List<Byte> tirePressure = new ArrayList<>(Arrays.asList(frontLeft, frontRight, rearLeft, rearRight));
        return tirePressure;
    }
}
