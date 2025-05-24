package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_node_vtable;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_node_vtable_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;

public final class ma_node_vtable extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(171).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_vtable(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_vtable(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_vtable() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_vtable.ma_node_vtablePointer asPointer() {
        return new ma_node_vtable.ma_node_vtablePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_vtable.ma_node_vtablePointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_node_vtable.onProcess> onProcess() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_node_vtable_Internal.onProcess_Internal::onProcess_downcall);
    }

    public void onProcess(ClosureObject<ma_node_vtable.onProcess> onProcess) {
        getBufPtr().setNativePointer(0, onProcess.getPointer());
    }

    public ClosureObject<ma_node_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_node_vtable_Internal.onGetRequiredInputFrameCount_Internal::onGetRequiredInputFrameCount_downcall);
    }

    public void onGetRequiredInputFrameCount(ClosureObject<ma_node_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onGetRequiredInputFrameCount.getPointer());
    }

    public char inputBusCount() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 16 : 8);
    }

    public void inputBusCount(char inputBusCount) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 16 : 8, inputBusCount);
    }

    public char outputBusCount() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 17 : 9);
    }

    public void outputBusCount(char outputBusCount) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 17 : 9, outputBusCount);
    }

    public long flags() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 12);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 12, flags);
    }

    public static final class ma_node_vtablePointer extends StackElementPointer<ma_node_vtable> {

        public ma_node_vtablePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_vtablePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_vtablePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_vtablePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_vtablePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_vtablePointer() {
            this(1, true);
        }

        public ma_node_vtablePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_vtable createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_vtable(ptr, freeOnGC);
        }
    }

    public interface onProcess extends Closure, ma_node_vtable_Internal.onProcess_Internal {

        void onProcess_call(VoidPointer pNode, PointerPointer<FloatPointer> ppFramesIn, UIntPointer pFrameCountIn, PointerPointer<FloatPointer> ppFramesOut, UIntPointer pFrameCountOut);
    }

    public interface onGetRequiredInputFrameCount extends Closure, ma_node_vtable_Internal.onGetRequiredInputFrameCount_Internal {

        ma_result onGetRequiredInputFrameCount_call(VoidPointer pNode, long outputFrameCount, UIntPointer pInputFrameCount);
    }
}
