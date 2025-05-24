package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_spatializer_listener_config;
import games.rednblack.miniaudio.internal.structs.ma_atomic_vec3f;

public final class ma_spatializer_listener extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(214).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_spatializer_listener(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_spatializer_listener(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_spatializer_listener() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_spatializer_listener.ma_spatializer_listenerPointer asPointer() {
        return new ma_spatializer_listener.ma_spatializer_listenerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_spatializer_listener.ma_spatializer_listenerPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_spatializer_listener_config config() {
        return new ma_spatializer_listener_config(getPointer(), false);
    }

    public void config(ma_spatializer_listener_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 48 : 40, this);
    }

    public ma_spatializer_listener_config getConfig() {
        return new ma_spatializer_listener_config(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 48 : 40), true);
    }

    public void getConfig(ma_spatializer_listener_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 40);
    }

    public void setConfig(ma_spatializer_listener_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 40);
    }

    public ma_atomic_vec3f position() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 48 : 40), false);
    }

    public void position(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 48 : 40), 16, this);
    }

    public ma_atomic_vec3f getPosition() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 48 : 40, 16), true);
    }

    public void getPosition(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 48 : 40, 16);
    }

    public void setPosition(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 48 : 40, toCopyFrom.getBufPtr(), 0, 16);
    }

    public ma_atomic_vec3f direction() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 64 : 56), false);
    }

    public void direction(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 64 : 56), 16, this);
    }

    public ma_atomic_vec3f getDirection() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 64 : 56, 16), true);
    }

    public void getDirection(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 64 : 56, 16);
    }

    public void setDirection(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 64 : 56, toCopyFrom.getBufPtr(), 0, 16);
    }

    public ma_atomic_vec3f velocity() {
        return new ma_atomic_vec3f(getPointer() + (CHandler.IS_64_BIT ? 80 : 72), false);
    }

    public void velocity(ma_atomic_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 80 : 72), 16, this);
    }

    public ma_atomic_vec3f getVelocity() {
        return new ma_atomic_vec3f(getBufPtr().duplicate(CHandler.IS_64_BIT ? 80 : 72, 16), true);
    }

    public void getVelocity(ma_atomic_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 80 : 72, 16);
    }

    public void setVelocity(ma_atomic_vec3f toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 80 : 72, toCopyFrom.getBufPtr(), 0, 16);
    }

    public long isEnabled() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 96 : 88);
    }

    public void isEnabled(long isEnabled) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 96 : 88, isEnabled);
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 100 : 92);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 100 : 92, _ownsHeap);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 104 : 96), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 104 : 96, _pHeap.getPointer());
    }

    public static final class ma_spatializer_listenerPointer extends StackElementPointer<ma_spatializer_listener> {

        public ma_spatializer_listenerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_spatializer_listenerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_spatializer_listenerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_spatializer_listenerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_spatializer_listenerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_spatializer_listenerPointer() {
            this(1, true);
        }

        public ma_spatializer_listenerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_spatializer_listener createStackElement(long ptr, boolean freeOnGC) {
            return new ma_spatializer_listener(ptr, freeOnGC);
        }
    }
}
