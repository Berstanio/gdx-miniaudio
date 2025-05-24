package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_config;
import games.rednblack.miniaudio.internal.structs.ma_lpf_config;

public final class ma_lpf_node_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(164).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_lpf_node_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_lpf_node_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_lpf_node_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_lpf_node_config.ma_lpf_node_configPointer asPointer() {
        return new ma_lpf_node_config.ma_lpf_node_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_lpf_node_config.ma_lpf_node_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_config nodeConfig() {
        return new ma_node_config(getPointer(), false);
    }

    public void nodeConfig(ma_node_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 40 : 24, this);
    }

    public ma_node_config getNodeConfig() {
        return new ma_node_config(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 40 : 24), true);
    }

    public void getNodeConfig(ma_node_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 24);
    }

    public void setNodeConfig(ma_node_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 24);
    }

    public ma_lpf_config lpf() {
        return new ma_lpf_config(getPointer() + (CHandler.IS_64_BIT ? 40 : 24), false);
    }

    public void lpf(ma_lpf_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 40 : 24), CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32, this);
    }

    public ma_lpf_config getLpf() {
        return new ma_lpf_config(getBufPtr().duplicate(CHandler.IS_64_BIT ? 40 : 24, CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32), true);
    }

    public void getLpf(ma_lpf_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 40 : 24, CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32);
    }

    public void setLpf(ma_lpf_config toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 40 : 24, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32);
    }

    public static final class ma_lpf_node_configPointer extends StackElementPointer<ma_lpf_node_config> {

        public ma_lpf_node_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_lpf_node_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_lpf_node_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_lpf_node_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_lpf_node_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_lpf_node_configPointer() {
            this(1, true);
        }

        public ma_lpf_node_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_lpf_node_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_lpf_node_config(ptr, freeOnGC);
        }
    }
}
