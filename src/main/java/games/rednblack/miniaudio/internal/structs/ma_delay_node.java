package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_base;
import games.rednblack.miniaudio.internal.structs.ma_delay;

public final class ma_delay_node extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(111).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_delay_node(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_delay_node(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_delay_node() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_delay_node.ma_delay_nodePointer asPointer() {
        return new ma_delay_node.ma_delay_nodePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_delay_node.ma_delay_nodePointer ptr) {
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

    public ma_delay delay() {
        return new ma_delay(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), false);
    }

    public void delay(ma_delay toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), CHandler.IS_64_BIT ? 48 : 40, this);
    }

    public ma_delay getDelay() {
        return new ma_delay(getBufPtr().duplicate(CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 48 : 40), true);
    }

    public void getDelay(ma_delay toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 48 : 40);
    }

    public void setDelay(ma_delay toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 360 : 256, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 40);
    }

    public static final class ma_delay_nodePointer extends StackElementPointer<ma_delay_node> {

        public ma_delay_nodePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_delay_nodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_delay_nodePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_delay_nodePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_delay_nodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_delay_nodePointer() {
            this(1, true);
        }

        public ma_delay_nodePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_delay_node createStackElement(long ptr, boolean freeOnGC) {
            return new ma_delay_node(ptr, freeOnGC);
        }
    }
}
