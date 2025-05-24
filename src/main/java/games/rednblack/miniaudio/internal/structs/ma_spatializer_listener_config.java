package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_handedness;
import games.rednblack.miniaudio.internal.structs.ma_vec3f;

public final class ma_spatializer_listener_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(215).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_spatializer_listener_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_spatializer_listener_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_spatializer_listener_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_spatializer_listener_config.ma_spatializer_listener_configPointer asPointer() {
        return new ma_spatializer_listener_config.ma_spatializer_listener_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_spatializer_listener_config.ma_spatializer_listener_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(0);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(0, channelsOut);
    }

    public UBytePointer pChannelMapOut() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pChannelMapOut(UBytePointer pChannelMapOut) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pChannelMapOut.getPointer());
    }

    public ma_handedness handedness() {
        return ma_handedness.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 8));
    }

    public void handedness(ma_handedness handedness) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 8, handedness.getIndex());
    }

    public float coneInnerAngleInRadians() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 20 : 12);
    }

    public void coneInnerAngleInRadians(float coneInnerAngleInRadians) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 20 : 12, coneInnerAngleInRadians);
    }

    public float coneOuterAngleInRadians() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 24 : 16);
    }

    public void coneOuterAngleInRadians(float coneOuterAngleInRadians) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 24 : 16, coneOuterAngleInRadians);
    }

    public float coneOuterGain() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 28 : 20);
    }

    public void coneOuterGain(float coneOuterGain) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 28 : 20, coneOuterGain);
    }

    public float speedOfSound() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 32 : 24);
    }

    public void speedOfSound(float speedOfSound) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 32 : 24, speedOfSound);
    }

    public ma_vec3f worldUp() {
        return new ma_vec3f(getPointer() + (CHandler.IS_64_BIT ? 36 : 28), false);
    }

    public void worldUp(ma_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 36 : 28), 12, this);
    }

    public ma_vec3f getWorldUp() {
        return new ma_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 36 : 28, 12), true);
    }

    public void getWorldUp(ma_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 36 : 28, 12);
    }

    public void setWorldUp(ma_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 36 : 28, toCopyFrom.getBufPtr(), 0, 12);
    }

    public static final class ma_spatializer_listener_configPointer extends StackElementPointer<ma_spatializer_listener_config> {

        public ma_spatializer_listener_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_spatializer_listener_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_spatializer_listener_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_spatializer_listener_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_spatializer_listener_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_spatializer_listener_configPointer() {
            this(1, true);
        }

        public ma_spatializer_listener_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_spatializer_listener_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_spatializer_listener_config(ptr, freeOnGC);
        }
    }
}
