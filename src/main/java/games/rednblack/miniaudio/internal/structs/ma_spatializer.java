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
import games.rednblack.miniaudio.internal.structs.ma_atomic_vec3f;
import games.rednblack.miniaudio.internal.structs.ma_gainer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;

public final class ma_spatializer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(212).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_spatializer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_spatializer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_spatializer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_spatializer.ma_spatializerPointer asPointer() {
        return new ma_spatializer.ma_spatializerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_spatializer.ma_spatializerPointer ptr) {
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

    public long gainSmoothTimeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 68 : 64);
    }

    public void gainSmoothTimeInFrames(long gainSmoothTimeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 68 : 64, gainSmoothTimeInFrames);
    }

    public ma_atomic_vec3f position() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 72 : 68), false);
    }

    public void position(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 72 : 68), 16, this);
    }

    public ma_atomic_vec3f getPosition() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 72 : 68, 16), true);
    }

    public void getPosition(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 72 : 68, 16);
    }

    public void setPosition(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 72 : 68, toCopyFrom.getBufPtr(), 0, 16);
    }

    public ma_atomic_vec3f direction() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 88 : 84), false);
    }

    public void direction(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 88 : 84), 16, this);
    }

    public ma_atomic_vec3f getDirection() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 88 : 84, 16), true);
    }

    public void getDirection(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 88 : 84, 16);
    }

    public void setDirection(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 88 : 84, toCopyFrom.getBufPtr(), 0, 16);
    }

    public ma_atomic_vec3f velocity() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 104 : 100), false);
    }

    public void velocity(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 104 : 100), 16, this);
    }

    public ma_atomic_vec3f getVelocity() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 104 : 100, 16), true);
    }

    public void getVelocity(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 104 : 100, 16);
    }

    public void setVelocity(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 104 : 100, toCopyFrom.getBufPtr(), 0, 16);
    }

    public float dopplerPitch() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 120 : 116);
    }

    public void dopplerPitch(float dopplerPitch) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 120 : 116, dopplerPitch);
    }

    public float minSpatializationChannelGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 124 : 120);
    }

    public void minSpatializationChannelGain(float minSpatializationChannelGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 124 : 120, minSpatializationChannelGain);
    }

    public ma_gainer gainer() {
        return new ma_gainer(getPointer() + (CHandler.IS_64_BIT ? 128 : 124), false);
    }

    public void gainer(ma_gainer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 128 : 124), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_gainer getGainer() {
        return new ma_gainer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 128 : 124, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getGainer(ma_gainer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 128 : 124, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setGainer(ma_gainer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 128 : 124, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public FloatPointer pNewChannelGainsOut() {
        return new FloatPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 176 : 156), false);
    }

    public void pNewChannelGainsOut(FloatPointer pNewChannelGainsOut) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 176 : 156, pNewChannelGainsOut.getPointer());
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 184 : 160), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 184 : 160, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 192 : 164);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 192 : 164, _ownsHeap);
    }

    public static final class ma_spatializerPointer extends StackElementPointer<ma_spatializer> {

        public ma_spatializerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_spatializerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_spatializerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_spatializerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_spatializerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_spatializerPointer() {
            this(1, true);
        }

        public ma_spatializerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_spatializer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_spatializer(ptr, freeOnGC);
        }
    }
}
