package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_node_graph_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(168).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_graph_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_graph_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_graph_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_graph_config.ma_node_graph_configPointer asPointer() {
        return new ma_node_graph_config.ma_node_graph_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_graph_config.ma_node_graph_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long channels() {
        return getBufPtr().getUInt(0);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(0, channels);
    }

    public long processingSizeInFrames() {
        return getBufPtr().getUInt(4);
    }

    public void processingSizeInFrames(long processingSizeInFrames) {
        getBufPtr().setUInt(4, processingSizeInFrames);
    }

    public long preMixStackSizeInBytes() {
        return getBufPtr().getNativeULong(8);
    }

    public void preMixStackSizeInBytes(long preMixStackSizeInBytes) {
        getBufPtr().setNativeULong(8, preMixStackSizeInBytes);
    }

    public static final class ma_node_graph_configPointer extends StackElementPointer<ma_node_graph_config> {

        public ma_node_graph_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_graph_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_graph_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_graph_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_graph_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_graph_configPointer() {
            this(1, true);
        }

        public ma_node_graph_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_graph_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_graph_config(ptr, freeOnGC);
        }
    }
}
