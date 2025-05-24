package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_output_bus;

public final class ma_node_input_bus extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(169).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_input_bus(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_input_bus(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_input_bus() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_input_bus.ma_node_input_busPointer asPointer() {
        return new ma_node_input_bus.ma_node_input_busPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_input_bus.ma_node_input_busPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_output_bus head() {
        return new ma_node_output_bus(getPointer(), false);
    }

    public void head(ma_node_output_bus toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 56 : 40, this);
    }

    public ma_node_output_bus getHead() {
        return new ma_node_output_bus(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 56 : 40), true);
    }

    public void getHead(ma_node_output_bus toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 56 : 40);
    }

    public void setHead(ma_node_output_bus toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 56 : 40);
    }

    public long nextCounter() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 56 : 40);
    }

    public void nextCounter(long nextCounter) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 56 : 40, nextCounter);
    }

    public long lock() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 60 : 44);
    }

    public void lock(long lock) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 60 : 44, lock);
    }

    public char channels() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 64 : 48);
    }

    public void channels(char channels) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 64 : 48, channels);
    }

    public static final class ma_node_input_busPointer extends StackElementPointer<ma_node_input_bus> {

        public ma_node_input_busPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_input_busPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_input_busPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_input_busPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_input_busPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_input_busPointer() {
            this(1, true);
        }

        public ma_node_input_busPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_input_bus createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_input_bus(ptr, freeOnGC);
        }
    }
}
