package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_gainer_config;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;

public final class ma_gainer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(133).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_gainer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_gainer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_gainer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_gainer.ma_gainerPointer asPointer() {
        return new ma_gainer.ma_gainerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_gainer.ma_gainerPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_gainer_config config() {
        return new ma_gainer_config(getPointer(), false);
    }

    public void config(ma_gainer_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public ma_gainer_config getConfig() {
        return new ma_gainer_config(getBufPtr().duplicate(0, 8), true);
    }

    public void getConfig(ma_gainer_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setConfig(ma_gainer_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public long t() {
        return getBufPtr().getUInt(8);
    }

    public void t(long t) {
        getBufPtr().setUInt(8, t);
    }

    public float masterVolume() {
        return getBufPtr().getFloat(12);
    }

    public void masterVolume(float masterVolume) {
        getBufPtr().setFloat(12, masterVolume);
    }

    public FloatPointer pOldGains() {
        return new FloatPointer(getBufPtr().getNativePointer(16), false);
    }

    public void pOldGains(FloatPointer pOldGains) {
        getBufPtr().setNativePointer(16, pOldGains.getPointer());
    }

    public FloatPointer pNewGains() {
        return new FloatPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 20), false);
    }

    public void pNewGains(FloatPointer pNewGains) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 20, pNewGains.getPointer());
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 24, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 40 : 28);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 40 : 28, _ownsHeap);
    }

    public static final class ma_gainerPointer extends StackElementPointer<ma_gainer> {

        public ma_gainerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_gainerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_gainerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_gainerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_gainerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_gainerPointer() {
            this(1, true);
        }

        public ma_gainerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_gainer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_gainer(ptr, freeOnGC);
        }
    }
}
