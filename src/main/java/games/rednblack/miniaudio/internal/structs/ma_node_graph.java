package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_base;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import games.rednblack.miniaudio.internal.structs.ma_stack;

public final class ma_node_graph extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(167).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_graph(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_graph(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_graph() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_graph.ma_node_graphPointer asPointer() {
        return new ma_node_graph.ma_node_graphPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_graph.ma_node_graphPointer ptr) {
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

    public ma_node_base endpoint() {
        return new ma_node_base(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), false);
    }

    public void endpoint(ma_node_base toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 360 : 256), CHandler.IS_64_BIT ? 360 : 256, this);
    }

    public ma_node_base getEndpoint() {
        return new ma_node_base(getBufPtr().duplicate(CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 360 : 256), true);
    }

    public void getEndpoint(ma_node_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 360 : 256, CHandler.IS_64_BIT ? 360 : 256);
    }

    public void setEndpoint(ma_node_base toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 360 : 256, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public FloatPointer pProcessingCache() {
        return new FloatPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 720 : 512), false);
    }

    public void pProcessingCache(FloatPointer pProcessingCache) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 720 : 512, pProcessingCache.getPointer());
    }

    public long processingCacheFramesRemaining() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 728 : 516);
    }

    public void processingCacheFramesRemaining(long processingCacheFramesRemaining) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 728 : 516, processingCacheFramesRemaining);
    }

    public long processingSizeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 732 : 520);
    }

    public void processingSizeInFrames(long processingSizeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 732 : 520, processingSizeInFrames);
    }

    public long isReading() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 736 : 524);
    }

    public void isReading(long isReading) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 736 : 524, isReading);
    }

    public ma_stack.ma_stackPointer pPreMixStack() {
        return new ma_stack.ma_stackPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 744 : 528), false);
    }

    public void pPreMixStack(ma_stack.ma_stackPointer pPreMixStack) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 744 : 528, pPreMixStack.getPointer());
    }

    public static final class ma_node_graphPointer extends StackElementPointer<ma_node_graph> {

        public ma_node_graphPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_graphPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_graphPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_graphPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_graphPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_graphPointer() {
            this(1, true);
        }

        public ma_node_graphPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_graph createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_graph(ptr, freeOnGC);
        }
    }
}
