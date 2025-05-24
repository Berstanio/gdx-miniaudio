package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_output_bus;

public final class ma_node_output_bus extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(170).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_output_bus(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_output_bus(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_output_bus() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_output_bus.ma_node_output_busPointer asPointer() {
        return new ma_node_output_bus.ma_node_output_busPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_output_bus.ma_node_output_busPointer ptr) {
        ptr.setPointer(this);
    }

    public VoidPointer pNode() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pNode(VoidPointer pNode) {
        getBufPtr().setNativePointer(0, pNode.getPointer());
    }

    public char outputBusIndex() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 8 : 4);
    }

    public void outputBusIndex(char outputBusIndex) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 8 : 4, outputBusIndex);
    }

    public char channels() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 9 : 5);
    }

    public void channels(char channels) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 9 : 5, channels);
    }

    public char inputNodeInputBusIndex() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 10 : 6);
    }

    public void inputNodeInputBusIndex(char inputNodeInputBusIndex) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 10 : 6, inputNodeInputBusIndex);
    }

    public long flags() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, flags);
    }

    public long refCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12);
    }

    public void refCount(long refCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, refCount);
    }

    public long isAttached() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 16);
    }

    public void isAttached(long isAttached) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 16, isAttached);
    }

    public long lock() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 20);
    }

    public void lock(long lock) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 20, lock);
    }

    public float volume() {
        return getBufPtr().getFloat(CHandler.IS_64_BIT ? 28 : 24);
    }

    public void volume(float volume) {
        getBufPtr().setFloat(CHandler.IS_64_BIT ? 28 : 24, volume);
    }

    public ma_node_output_bus.ma_node_output_busPointer pNext() {
        return new ma_node_output_bus.ma_node_output_busPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 28), false);
    }

    public void pNext(ma_node_output_bus.ma_node_output_busPointer pNext) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 28, pNext.getPointer());
    }

    public ma_node_output_bus.ma_node_output_busPointer pPrev() {
        return new ma_node_output_bus.ma_node_output_busPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 32), false);
    }

    public void pPrev(ma_node_output_bus.ma_node_output_busPointer pPrev) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 32, pPrev.getPointer());
    }

    public VoidPointer pInputNode() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 36), false);
    }

    public void pInputNode(VoidPointer pInputNode) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 36, pInputNode.getPointer());
    }

    public static final class ma_node_output_busPointer extends StackElementPointer<ma_node_output_bus> {

        public ma_node_output_busPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_output_busPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_output_busPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_output_busPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_output_busPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_output_busPointer() {
            this(1, true);
        }

        public ma_node_output_busPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_output_bus createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_output_bus(ptr, freeOnGC);
        }
    }
}
