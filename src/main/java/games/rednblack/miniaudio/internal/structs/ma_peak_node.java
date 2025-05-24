package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_base;
import games.rednblack.miniaudio.internal.structs.ma_peak2;

public final class ma_peak_node extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(187).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_peak_node(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_peak_node(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_peak_node() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_peak_node.ma_peak_nodePointer asPointer() {
        return new ma_peak_node.ma_peak_nodePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_peak_node.ma_peak_nodePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_base baseNode() {
        return new ma_node_base(getPointer(), false);
    }

    public void baseNode(ma_node_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 360 : 256, this);
    }

    public ma_node_base getBaseNode() {
        return new ma_node_base(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 360 : 256), true);
    }

    public void getBaseNode(ma_node_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public void setBaseNode(ma_node_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public ma_peak2 peak() {
        return new ma_peak2(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), false);
    }

    public void peak(ma_peak2 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), CHandler.IS_64_BIT ? 64 : 44, this);
    }

    public ma_peak2 getPeak() {
        return new ma_peak2(getBufPtr().duplicate(CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 64 : 44), true);
    }

    public void getPeak(ma_peak2 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 64 : 44);
    }

    public void setPeak(ma_peak2 toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 360 : 256, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 44);
    }

    public static final class ma_peak_nodePointer extends StackElementPointer<ma_peak_node> {

        public ma_peak_nodePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_peak_nodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_peak_nodePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_peak_nodePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_peak_nodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_peak_nodePointer() {
            this(1, true);
        }

        public ma_peak_nodePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_peak_node createStackElement(long ptr, boolean freeOnGC) {
            return new ma_peak_node(ptr, freeOnGC);
        }
    }
}
