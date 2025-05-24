package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_vtable;
import games.rednblack.miniaudio.internal.enums.ma_node_state;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;

public final class ma_node_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(166).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_config.ma_node_configPointer asPointer() {
        return new ma_node_config.ma_node_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_config.ma_node_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_vtable.ma_node_vtablePointer vtable() {
        return new ma_node_vtable.ma_node_vtablePointer(getBufPtr().getNativePointer(0), false);
    }

    public void vtable(ma_node_vtable.ma_node_vtablePointer vtable) {
        getBufPtr().setNativePointer(0, vtable.getPointer());
    }

    public ma_node_state initialState() {
        return ma_node_state.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
    }

    public void initialState(ma_node_state initialState) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, initialState.getIndex());
    }

    public long inputBusCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
    }

    public void inputBusCount(long inputBusCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, inputBusCount);
    }

    public long outputBusCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12);
    }

    public void outputBusCount(long outputBusCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, outputBusCount);
    }

    public UIntPointer pInputChannels() {
        return new UIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false);
    }

    public void pInputChannels(UIntPointer pInputChannels) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pInputChannels.getPointer());
    }

    public UIntPointer pOutputChannels() {
        return new UIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 20), false);
    }

    public void pOutputChannels(UIntPointer pOutputChannels) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 20, pOutputChannels.getPointer());
    }

    public static final class ma_node_configPointer extends StackElementPointer<ma_node_config> {

        public ma_node_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_configPointer() {
            this(1, true);
        }

        public ma_node_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_config(ptr, freeOnGC);
        }
    }
}
