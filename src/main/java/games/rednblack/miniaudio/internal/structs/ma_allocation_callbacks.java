package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_allocation_callbacks_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;

public final class ma_allocation_callbacks extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(69).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_allocation_callbacks(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_allocation_callbacks(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_allocation_callbacks() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_allocation_callbacks.ma_allocation_callbacksPointer asPointer() {
        return new ma_allocation_callbacks.ma_allocation_callbacksPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_allocation_callbacks.ma_allocation_callbacksPointer ptr) {
        ptr.setPointer(this);
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer(0, pUserData.getPointer());
    }

    public ClosureObject<ma_allocation_callbacks.onMalloc> onMalloc() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_allocation_callbacks_Internal.onMalloc_Internal::onMalloc_downcall);
    }

    public void onMalloc(ClosureObject<ma_allocation_callbacks.onMalloc> onMalloc) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onMalloc.getPointer());
    }

    public ClosureObject<ma_allocation_callbacks.onRealloc> onRealloc() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_allocation_callbacks_Internal.onRealloc_Internal::onRealloc_downcall);
    }

    public void onRealloc(ClosureObject<ma_allocation_callbacks.onRealloc> onRealloc) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onRealloc.getPointer());
    }

    public ClosureObject<ma_allocation_callbacks.onFree> onFree() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_allocation_callbacks_Internal.onFree_Internal::onFree_downcall);
    }

    public void onFree(ClosureObject<ma_allocation_callbacks.onFree> onFree) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onFree.getPointer());
    }

    public static final class ma_allocation_callbacksPointer extends StackElementPointer<ma_allocation_callbacks> {

        public ma_allocation_callbacksPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_allocation_callbacksPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_allocation_callbacksPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_allocation_callbacksPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_allocation_callbacksPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_allocation_callbacksPointer() {
            this(1, true);
        }

        public ma_allocation_callbacksPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_allocation_callbacks createStackElement(long ptr, boolean freeOnGC) {
            return new ma_allocation_callbacks(ptr, freeOnGC);
        }
    }

    public interface onMalloc extends Closure, ma_allocation_callbacks_Internal.onMalloc_Internal {

        VoidPointer onMalloc_call(long sz, VoidPointer pUserData);
    }

    public interface onRealloc extends Closure, ma_allocation_callbacks_Internal.onRealloc_Internal {

        VoidPointer onRealloc_call(VoidPointer p, long sz, VoidPointer pUserData);
    }

    public interface onFree extends Closure, ma_allocation_callbacks_Internal.onFree_Internal {

        void onFree_call(VoidPointer p, VoidPointer pUserData);
    }
}
