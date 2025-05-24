package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_async_notification_callbacks;

public final class ma_async_notification_poll extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(72).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_async_notification_poll(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_async_notification_poll(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_async_notification_poll() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_async_notification_poll.ma_async_notification_pollPointer asPointer() {
        return new ma_async_notification_poll.ma_async_notification_pollPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_async_notification_poll.ma_async_notification_pollPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_async_notification_callbacks cb() {
        return new ma_async_notification_callbacks(getPointer(), false);
    }

    public void cb(ma_async_notification_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 8 : 4, this);
    }

    public ma_async_notification_callbacks getCb() {
        return new ma_async_notification_callbacks(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 8 : 4), true);
    }

    public void getCb(ma_async_notification_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public void setCb(ma_async_notification_callbacks toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public long signalled() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4);
    }

    public void signalled(long signalled) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, signalled);
    }

    public static final class ma_async_notification_pollPointer extends StackElementPointer<ma_async_notification_poll> {

        public ma_async_notification_pollPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_async_notification_pollPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_async_notification_pollPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_async_notification_pollPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_async_notification_pollPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_async_notification_pollPointer() {
            this(1, true);
        }

        public ma_async_notification_pollPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_async_notification_poll createStackElement(long ptr, boolean freeOnGC) {
            return new ma_async_notification_poll(ptr, freeOnGC);
        }
    }
}
