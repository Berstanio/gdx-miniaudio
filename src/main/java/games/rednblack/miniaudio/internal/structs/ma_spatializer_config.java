package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_attenuation_model;
import games.rednblack.miniaudio.internal.enums.ma_positioning;
import games.rednblack.miniaudio.internal.enums.ma_handedness;

public final class ma_spatializer_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(213).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_spatializer_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_spatializer_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_spatializer_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_spatializer_config.ma_spatializer_configPointer asPointer() {
        return new ma_spatializer_config.ma_spatializer_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_spatializer_config.ma_spatializer_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long channelsIn() {
        return getBufPtr().getUInt(0);
    }

    public void channelsIn(long channelsIn) {
        getBufPtr().setUInt(0, channelsIn);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(4);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(4, channelsOut);
    }

    public UBytePointer pChannelMapIn() {
        return new UBytePointer(getBufPtr().getNativePointer(8), false);
    }

    public void pChannelMapIn(UBytePointer pChannelMapIn) {
        getBufPtr().setNativePointer(8, pChannelMapIn.getPointer());
    }

    public ma_attenuation_model attenuationModel() {
        return ma_attenuation_model.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12));
    }

    public void attenuationModel(ma_attenuation_model attenuationModel) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, attenuationModel.getIndex());
    }

    public ma_positioning positioning() {
        return ma_positioning.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 16));
    }

    public void positioning(ma_positioning positioning) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 16, positioning.getIndex());
    }

    public ma_handedness handedness() {
        return ma_handedness.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 20));
    }

    public void handedness(ma_handedness handedness) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 20, handedness.getIndex());
    }

    public float minGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 28 : 24);
    }

    public void minGain(float minGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 28 : 24, minGain);
    }

    public float maxGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 32 : 28);
    }

    public void maxGain(float maxGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 32 : 28, maxGain);
    }

    public float minDistance() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 36 : 32);
    }

    public void minDistance(float minDistance) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 36 : 32, minDistance);
    }

    public float maxDistance() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 40 : 36);
    }

    public void maxDistance(float maxDistance) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 40 : 36, maxDistance);
    }

    public float rolloff() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 44 : 40);
    }

    public void rolloff(float rolloff) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 44 : 40, rolloff);
    }

    public float coneInnerAngleInRadians() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 48 : 44);
    }

    public void coneInnerAngleInRadians(float coneInnerAngleInRadians) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 48 : 44, coneInnerAngleInRadians);
    }

    public float coneOuterAngleInRadians() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 52 : 48);
    }

    public void coneOuterAngleInRadians(float coneOuterAngleInRadians) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 52 : 48, coneOuterAngleInRadians);
    }

    public float coneOuterGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 56 : 52);
    }

    public void coneOuterGain(float coneOuterGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 56 : 52, coneOuterGain);
    }

    public float dopplerFactor() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 60 : 56);
    }

    public void dopplerFactor(float dopplerFactor) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 60 : 56, dopplerFactor);
    }

    public float directionalAttenuationFactor() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 64 : 60);
    }

    public void directionalAttenuationFactor(float directionalAttenuationFactor) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 64 : 60, directionalAttenuationFactor);
    }

    public float minSpatializationChannelGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 68 : 64);
    }

    public void minSpatializationChannelGain(float minSpatializationChannelGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 68 : 64, minSpatializationChannelGain);
    }

    public long gainSmoothTimeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 72 : 68);
    }

    public void gainSmoothTimeInFrames(long gainSmoothTimeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 72 : 68, gainSmoothTimeInFrames);
    }

    public static final class ma_spatializer_configPointer extends StackElementPointer<ma_spatializer_config> {

        public ma_spatializer_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_spatializer_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_spatializer_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_spatializer_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_spatializer_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_spatializer_configPointer() {
            this(1, true);
        }

        public ma_spatializer_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_spatializer_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_spatializer_config(ptr, freeOnGC);
        }
    }
}
