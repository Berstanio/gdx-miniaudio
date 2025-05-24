package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_job_queue extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(147).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_job_queue(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_job_queue(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_job_queue() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_job_queue.ma_job_queuePointer asPointer() {
        return new ma_job_queue.ma_job_queuePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_job_queue.ma_job_queuePointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_job_queuePointer extends StackElementPointer<ma_job_queue> {

        public ma_job_queuePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_job_queuePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_job_queuePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_job_queuePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_job_queuePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_job_queuePointer() {
            this(1, true);
        }

        public ma_job_queuePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_job_queue createStackElement(long ptr, boolean freeOnGC) {
            return new ma_job_queue(ptr, freeOnGC);
        }
    }
}
