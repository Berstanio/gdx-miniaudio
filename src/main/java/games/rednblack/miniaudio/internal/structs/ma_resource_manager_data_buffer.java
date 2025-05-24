package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_buffer_node;
import games.rednblack.miniaudio.internal.enums.ma_result;
import games.rednblack.miniaudio.internal.structs.ma_atomic_bool32;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_buffer.connector;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_decoder;
import games.rednblack.miniaudio.internal.structs.ma_audio_buffer;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer;

public final class ma_resource_manager_data_buffer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(197).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_buffer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_buffer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_buffer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer asPointer() {
        return new ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_data_source_base ds() {
        return new ma_data_source_base(getPointer(), false);
    }

    public void ds(ma_data_source_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, this);
    }

    public ma_data_source_base getDs() {
        return new ma_data_source_base(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), true);
    }

    public void getDs(ma_data_source_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public void setDs(ma_data_source_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public ma_resource_manager.ma_resource_managerPointer pResourceManager() {
        return new ma_resource_manager.ma_resource_managerPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void pResourceManager(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, pResourceManager.getPointer());
    }

    public ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pNode() {
        return new ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60), false);
    }

    public void pNode(ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pNode) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60, pNode.getPointer());
    }

    public long flags() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88);
    }

    public void flags(long flags) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, flags);
    }

    public long executionCounter() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 68 : 92);
    }

    public void executionCounter(long executionCounter) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 68 : 92, executionCounter);
    }

    public long executionPointer() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 72);
    }

    public void executionPointer(long executionPointer) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 72, executionPointer);
    }

    public long seekTargetInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104);
    }

    public void seekTargetInPCMFrames(long seekTargetInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104, seekTargetInPCMFrames);
    }

    public long seekToCursorOnNextRead() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 88);
    }

    public void seekToCursorOnNextRead(long seekToCursorOnNextRead) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 88, seekToCursorOnNextRead);
    }

    public ma_result result() {
        return ma_result.getByIndex((int) getBufPtr().getInt((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 116 : 92));
    }

    public void result(ma_result result) {
        getBufPtr().setInt((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 116 : 92, result.getIndex());
    }

    public long isLooping() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 120);
    }

    public void isLooping(long isLooping) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 120, isLooping);
    }

    public ma_atomic_bool32 isConnectorInitialized() {
        return new ma_atomic_bool32(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 124), false);
    }

    public void isConnectorInitialized(ma_atomic_bool32 toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 124), 4, this);
    }

    public ma_atomic_bool32 getIsConnectorInitialized() {
        return new ma_atomic_bool32(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 124, 4), true);
    }

    public void getIsConnectorInitialized(ma_atomic_bool32 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 124, 4);
    }

    public void setIsConnectorInitialized(ma_atomic_bool32 toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 124, toCopyFrom.getBufPtr(), 0, 4);
    }

    public connector connector() {
        return new connector(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 104), false);
    }

    public void connector(connector toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 104), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416, this);
    }

    public connector getConnector() {
        return new connector(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 104, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416), true);
    }

    public void getConnector(connector toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 104, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
    }

    public void setConnector(connector toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 104, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
    }

    public static final class ma_resource_manager_data_bufferPointer extends StackElementPointer<ma_resource_manager_data_buffer> {

        public ma_resource_manager_data_bufferPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_bufferPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_bufferPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_bufferPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_bufferPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_bufferPointer() {
            this(1, true);
        }

        public ma_resource_manager_data_bufferPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_buffer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_buffer(ptr, freeOnGC);
        }
    }

    public final static class connector extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(42).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public connector(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public connector(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public connector() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public connector.connectorPointer asPointer() {
            return new connector.connectorPointer(getPointer(), false, 1, this);
        }

        public void asPointer(connector.connectorPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_decoder decoder() {
            return new ma_decoder(getPointer(), false);
        }

        public void decoder(ma_decoder toSetPtr) {
            toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416, this);
        }

        public ma_decoder getDecoder() {
            return new ma_decoder(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416), true);
        }

        public void getDecoder(ma_decoder toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
        }

        public void setDecoder(ma_decoder toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
        }

        public ma_audio_buffer buffer() {
            return new ma_audio_buffer(getPointer(), false);
        }

        public void buffer(ma_audio_buffer toSetPtr) {
            toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 152 : 120, this);
        }

        public ma_audio_buffer getBuffer() {
            return new ma_audio_buffer(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 152 : 120), true);
        }

        public void getBuffer(ma_audio_buffer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 152 : 120);
        }

        public void setBuffer(ma_audio_buffer toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 152 : 120);
        }

        public ma_paged_audio_buffer pagedBuffer() {
            return new ma_paged_audio_buffer(getPointer(), false);
        }

        public void pagedBuffer(ma_paged_audio_buffer toSetPtr) {
            toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104, this);
        }

        public ma_paged_audio_buffer getPagedBuffer() {
            return new ma_paged_audio_buffer(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104), true);
        }

        public void getPagedBuffer(ma_paged_audio_buffer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104);
        }

        public void setPagedBuffer(ma_paged_audio_buffer toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104);
        }

        public static final class connectorPointer extends StackElementPointer<connector> {

            public connectorPointer(VoidPointer pointer) {
                super(pointer);
            }

            public connectorPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public connectorPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public connectorPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public connectorPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public connectorPointer() {
                this(1, true);
            }

            public connectorPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected connector createStackElement(long ptr, boolean freeOnGC) {
                return new connector(ptr, freeOnGC);
            }
        }
    }
}
