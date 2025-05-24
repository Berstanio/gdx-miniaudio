package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;

public final class ma_log_callback extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(153).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_log_callback(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_log_callback(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_log_callback() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_log_callback.ma_log_callbackPointer asPointer() {
        return new ma_log_callback.ma_log_callbackPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_log_callback.ma_log_callbackPointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<GdxMiniaudio.ma_log_callback_proc> onLog() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), GdxMiniaudio_Internal.ma_log_callback_proc_Internal::ma_log_callback_proc_downcall);
    }

    public void onLog(ClosureObject<GdxMiniaudio.ma_log_callback_proc> onLog) {
        getBufPtr().setNativePointer(0, onLog.getPointer());
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pUserData.getPointer());
    }

    public static final class ma_log_callbackPointer extends StackElementPointer<ma_log_callback> {

        public ma_log_callbackPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_log_callbackPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_log_callbackPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_log_callbackPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_log_callbackPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_log_callbackPointer() {
            this(1, true);
        }

        public ma_log_callbackPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_log_callback createStackElement(long ptr, boolean freeOnGC) {
            return new ma_log_callback(ptr, freeOnGC);
        }
    }
}
