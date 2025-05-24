package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_async_notification_callbacks;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_async_notification_callbacks_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;

public final class ma_async_notification_callbacks extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(70).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_async_notification_callbacks(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_async_notification_callbacks(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_async_notification_callbacks() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_async_notification_callbacks.ma_async_notification_callbacksPointer asPointer() {
        return new ma_async_notification_callbacks.ma_async_notification_callbacksPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_async_notification_callbacks.ma_async_notification_callbacksPointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_async_notification_callbacks.onSignal> onSignal() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_async_notification_callbacks_Internal.onSignal_Internal::onSignal_downcall);
    }

    public void onSignal(ClosureObject<ma_async_notification_callbacks.onSignal> onSignal) {
        getBufPtr().setNativePointer(0, onSignal.getPointer());
    }

    public static final class ma_async_notification_callbacksPointer extends StackElementPointer<ma_async_notification_callbacks> {

        public ma_async_notification_callbacksPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_async_notification_callbacksPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_async_notification_callbacksPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_async_notification_callbacksPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_async_notification_callbacksPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_async_notification_callbacksPointer() {
            this(1, true);
        }

        public ma_async_notification_callbacksPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_async_notification_callbacks createStackElement(long ptr, boolean freeOnGC) {
            return new ma_async_notification_callbacks(ptr, freeOnGC);
        }
    }

    public interface onSignal extends Closure, ma_async_notification_callbacks_Internal.onSignal_Internal {

        void onSignal_call(VoidPointer pNotification);
    }
}
