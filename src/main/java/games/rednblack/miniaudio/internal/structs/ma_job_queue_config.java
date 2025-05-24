package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_job_queue_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(148).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_job_queue_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_job_queue_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_job_queue_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_job_queue_config.ma_job_queue_configPointer asPointer() {
        return new ma_job_queue_config.ma_job_queue_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_job_queue_config.ma_job_queue_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long flags() {
        return getBufPtr().getUInt(0);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(0, flags);
    }

    public long capacity() {
        return getBufPtr().getUInt(4);
    }

    public void capacity(long capacity) {
        getBufPtr().setUInt(4, capacity);
    }

    public static final class ma_job_queue_configPointer extends StackElementPointer<ma_job_queue_config> {

        public ma_job_queue_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_job_queue_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_job_queue_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_job_queue_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_job_queue_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_job_queue_configPointer() {
            this(1, true);
        }

        public ma_job_queue_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_job_queue_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_job_queue_config(ptr, freeOnGC);
        }
    }
}
