package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_base;

public final class ma_splitter_node extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(216).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_splitter_node(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_splitter_node(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_splitter_node() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_splitter_node.ma_splitter_nodePointer asPointer() {
        return new ma_splitter_node.ma_splitter_nodePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_splitter_node.ma_splitter_nodePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_base base() {
        return new ma_node_base(getPointer(), false);
    }

    public void base(ma_node_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 360 : 256, this);
    }

    public ma_node_base getBase() {
        return new ma_node_base(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 360 : 256), true);
    }

    public void getBase(ma_node_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public void setBase(ma_node_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public static final class ma_splitter_nodePointer extends StackElementPointer<ma_splitter_node> {

        public ma_splitter_nodePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_splitter_nodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_splitter_nodePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_splitter_nodePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_splitter_nodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_splitter_nodePointer() {
            this(1, true);
        }

        public ma_splitter_nodePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_splitter_node createStackElement(long ptr, boolean freeOnGC) {
            return new ma_splitter_node(ptr, freeOnGC);
        }
    }
}
