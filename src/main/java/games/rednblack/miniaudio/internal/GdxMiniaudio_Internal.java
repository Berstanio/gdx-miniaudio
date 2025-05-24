package games.rednblack.miniaudio.internal;

import com.badlogic.gdx.jnigen.runtime.c.CTypeInfo;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.mem.BufferPtr;
import com.badlogic.gdx.jnigen.runtime.closure.PointingPoolManager;
import games.rednblack.miniaudio.internal.structs.ma_backend_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_context;
import games.rednblack.miniaudio.internal.structs.ma_context_config;
import games.rednblack.miniaudio.internal.enums.ma_result;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureEncoder;
import com.badlogic.gdx.jnigen.runtime.closure.CClosureObject;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.enums.ma_device_type;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import games.rednblack.miniaudio.internal.structs.ma_device_info;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.structs.ma_device_config;
import games.rednblack.miniaudio.internal.structs.ma_device_descriptor;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;
import games.rednblack.miniaudio.internal.structs.ma_data_source_vtable;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UInt64Pointer;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.structs.ma_resampling_backend_vtable;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.ULongPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_async_notification_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_vfs_callbacks;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import games.rednblack.miniaudio.internal.enums.ma_seek_origin;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SInt64Pointer;
import games.rednblack.miniaudio.internal.structs.ma_file_info;
import games.rednblack.miniaudio.internal.structs.ma_node_vtable;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_vtable;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_config;
import games.rednblack.miniaudio.internal.structs.ma_encoder;
import games.rednblack.miniaudio.internal.structs.ma_decoder;
import games.rednblack.miniaudio.internal.structs.ma_sound;
import games.rednblack.miniaudio.internal.structs.ma_job;
import games.rednblack.miniaudio.internal.structs.ma_device_notification;

public final class GdxMiniaudio_Internal {

    public final static class ma_lpf_config_Internal {
    }

    public final static class ma_bpf2_config_Internal {
    }

    public final static class ma_delay_node_Internal {
    }

    public final static class ma_biquad_Internal {
    }

    public final static class ma_fader_Internal {
    }

    public final static class ma_audio_buffer_Internal {
    }

    public final static class ma_atomic_device_state_Internal {
    }

    public final static class ma_decoding_backend_config_Internal {
    }

    public final static class ma_job_Internal {

        public final static class toc_Internal {

            public final static class breakup_Internal {
            }
        }

        public final static class data_Internal {

            public final static class custom_Internal {
            }

            public final static class resourceManager_Internal {

                public final static class loadDataBufferNode_Internal {
                }

                public final static class freeDataBufferNode_Internal {
                }

                public final static class pageDataBufferNode_Internal {
                }

                public final static class loadDataBuffer_Internal {
                }

                public final static class freeDataBuffer_Internal {
                }

                public final static class loadDataStream_Internal {
                }

                public final static class freeDataStream_Internal {
                }

                public final static class pageDataStream_Internal {
                }

                public final static class seekDataStream_Internal {
                }
            }

            public final static class device_Internal {

                public final static class aaudio_Internal {

                    public final static class reroute_Internal {
                    }
                }
            }
        }
    }

    public final static class ma_resource_manager_pipeline_notifications_Internal {
    }

    public final static class ma_waveform_Internal {
    }

    public final static class ma_job_queue_Internal {
    }

    public final static class ma_timer_Internal {
    }

    public final static class ma_resource_manager_data_source_config_Internal {
    }

    public final static class ma_job_queue_config_Internal {
    }

    public final static class ma_resource_manager_data_supply_Internal {

        public final static class backend_Internal {

            public final static class encoded_Internal {
            }

            public final static class decoded_Internal {
            }

            public final static class decodedPaged_Internal {
            }
        }
    }

    public final static class ma_engine_node_config_Internal {
    }

    public final static class ma_lpf1_Internal {
    }

    public final static class ma_backend_callbacks_Internal {

        public interface onContextInit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onContextInit_call(ma_context.ma_contextPointer pContext, ma_context_config.ma_context_configPointer pConfig, ma_backend_callbacks.ma_backend_callbacksPointer pCallbacks);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onContextInit_call(new ma_context.ma_contextPointer(buf.getNativePointer(0), false), new ma_context_config.ma_context_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_backend_callbacks.ma_backend_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onContextInit_call(manager.getPointing(ma_context.ma_contextPointer.class, buf.getNativePointer(0)), manager.getPointing(ma_context_config.ma_context_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_backend_callbacks.ma_backend_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onContextInit> onContextInit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pContext, pConfig, pCallbacks) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pContext.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pCallbacks.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onContextUninit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onContextUninit_call(ma_context.ma_contextPointer pContext);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onContextUninit_call(new ma_context.ma_contextPointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onContextUninit_call(manager.getPointing(ma_context.ma_contextPointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onContextUninit> onContextUninit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pContext) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pContext.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onContextEnumerateDevices_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onContextEnumerateDevices_call(ma_context.ma_contextPointer pContext, ClosureObject<GdxMiniaudio.ma_enum_devices_callback_proc> callback, VoidPointer pUserData);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onContextEnumerateDevices_call(new ma_context.ma_contextPointer(buf.getNativePointer(0), false), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), GdxMiniaudio_Internal.ma_enum_devices_callback_proc_Internal::ma_enum_devices_callback_proc_downcall), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onContextEnumerateDevices_call(manager.getPointing(ma_context.ma_contextPointer.class, buf.getNativePointer(0)), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), GdxMiniaudio_Internal.ma_enum_devices_callback_proc_Internal::ma_enum_devices_callback_proc_downcall), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onContextEnumerateDevices> onContextEnumerateDevices_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pContext, callback, pUserData) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pContext.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, callback.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pUserData.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onContextGetDeviceInfo_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(29), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onContextGetDeviceInfo_call(ma_context.ma_contextPointer pContext, ma_device_type deviceType, ma_device_id.ma_device_idPointer pDeviceID, ma_device_info.ma_device_infoPointer pDeviceInfo);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onContextGetDeviceInfo_call(new ma_context.ma_contextPointer(buf.getNativePointer(0), false), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), new ma_device_id.ma_device_idPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8), false), new ma_device_info.ma_device_infoPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onContextGetDeviceInfo_call(manager.getPointing(ma_context.ma_contextPointer.class, buf.getNativePointer(0)), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_device_id.ma_device_idPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(ma_device_info.ma_device_infoPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onContextGetDeviceInfo> onContextGetDeviceInfo_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pContext, deviceType, pDeviceID, pDeviceInfo) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pContext.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, deviceType.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 12 : 8, pDeviceID.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pDeviceInfo.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceInit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceInit_call(ma_device.ma_devicePointer pDevice, ma_device_config.ma_device_configPointer pConfig, ma_device_descriptor.ma_device_descriptorPointer pDescriptorPlayback, ma_device_descriptor.ma_device_descriptorPointer pDescriptorCapture);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceInit_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false), new ma_device_config.ma_device_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_device_descriptor.ma_device_descriptorPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new ma_device_descriptor.ma_device_descriptorPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceInit_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)), manager.getPointing(ma_device_config.ma_device_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_device_descriptor.ma_device_descriptorPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(ma_device_descriptor.ma_device_descriptorPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceInit> onDeviceInit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice, pConfig, pDescriptorPlayback, pDescriptorCapture) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDescriptorPlayback.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pDescriptorCapture.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceUninit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceUninit_call(ma_device.ma_devicePointer pDevice);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceUninit_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceUninit_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceUninit> onDeviceUninit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceStart_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceStart_call(ma_device.ma_devicePointer pDevice);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceStart_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceStart_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceStart> onDeviceStart_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceStop_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceStop_call(ma_device.ma_devicePointer pDevice);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceStop_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceStop_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceStop> onDeviceStop_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceRead_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceRead_call(ma_device.ma_devicePointer pDevice, VoidPointer pFrames, long frameCount, UIntPointer pFramesRead);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceRead_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceRead_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceRead> onDeviceRead_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice, pFrames, frameCount, pFramesRead) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFrames.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, frameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pFramesRead.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceWrite_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceWrite_call(ma_device.ma_devicePointer pDevice, VoidPointer pFrames, long frameCount, UIntPointer pFramesWritten);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceWrite_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceWrite_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceWrite> onDeviceWrite_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice, pFrames, frameCount, pFramesWritten) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFrames.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, frameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pFramesWritten.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceDataLoop_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceDataLoop_call(ma_device.ma_devicePointer pDevice);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceDataLoop_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceDataLoop_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceDataLoop> onDeviceDataLoop_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceDataLoopWakeup_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceDataLoopWakeup_call(ma_device.ma_devicePointer pDevice);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceDataLoopWakeup_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceDataLoopWakeup_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceDataLoopWakeup> onDeviceDataLoopWakeup_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onDeviceGetInfo_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(29), FFITypes.getCTypeInfo(-1) };

            ma_result onDeviceGetInfo_call(ma_device.ma_devicePointer pDevice, ma_device_type type, ma_device_info.ma_device_infoPointer pDeviceInfo);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onDeviceGetInfo_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), new ma_device_info.ma_device_infoPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onDeviceGetInfo_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_device_info.ma_device_infoPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8))).getIndex());
            }

            public static CClosureObject<ma_backend_callbacks.onDeviceGetInfo> onDeviceGetInfo_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDevice, type, pDeviceInfo) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDevice.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, type.getIndex());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 12 : 8, pDeviceInfo.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_data_source_node_Internal {
    }

    public final static class ma_lpf2_Internal {
    }

    public final static class ma_async_notification_event_Internal {
    }

    public final static class ma_data_source_vtable_Internal {

        public interface onRead_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1) };

            ma_result onRead_call(VoidPointer pDataSource, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onRead_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onRead_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onRead> onRead_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, pFramesOut, frameCount, pFramesRead) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFramesOut.getPointer());
                    bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, frameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pFramesRead.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onSeek_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23) };

            ma_result onSeek_call(VoidPointer pDataSource, long frameIndex);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onSeek_call(new VoidPointer(buf.getNativePointer(0), false), buf.getLong(CHandler.IS_64_BIT ? 8 : 4)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onSeek_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getLong(CHandler.IS_64_BIT ? 8 : 4)).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onSeek> onSeek_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, frameIndex) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setLong(CHandler.IS_64_BIT ? 8 : 4, frameIndex);
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetDataFormat_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27) };

            ma_result onGetDataFormat_call(VoidPointer pDataSource, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetDataFormat_call(new VoidPointer(buf.getNativePointer(0), false), new ma_format.ma_formatPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false), new UBytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false), buf.getNativeULong(CHandler.IS_64_BIT ? 40 : 20)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetDataFormat_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(ma_format.ma_formatPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12)), manager.getPointing(UBytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16)), buf.getNativeULong(CHandler.IS_64_BIT ? 40 : 20)).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onGetDataFormat> onGetDataFormat_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, pFormat, pChannels, pSampleRate, pChannelMap, channelMapCap) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFormat.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pChannels.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pSampleRate.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pChannelMap.getPointer());
                    bufPtr.setNativeULong(CHandler.IS_64_BIT ? 40 : 20, channelMapCap);
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 44 : 24));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetCursor_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onGetCursor_call(VoidPointer pDataSource, UInt64Pointer pCursor);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetCursor_call(new VoidPointer(buf.getNativePointer(0), false), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetCursor_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onGetCursor> onGetCursor_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, pCursor) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pCursor.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetLength_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onGetLength_call(VoidPointer pDataSource, UInt64Pointer pLength);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetLength_call(new VoidPointer(buf.getNativePointer(0), false), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetLength_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onGetLength> onGetLength_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, pLength) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pLength.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onSetLooping_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(13) };

            ma_result onSetLooping_call(VoidPointer pDataSource, long isLooping);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onSetLooping_call(new VoidPointer(buf.getNativePointer(0), false), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onSetLooping_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)).getIndex());
            }

            public static CClosureObject<ma_data_source_vtable.onSetLooping> onSetLooping_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pDataSource, isLooping) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pDataSource.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, isLooping);
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 12 : 8));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_paged_audio_buffer_config_Internal {
    }

    public final static class ma_noise_config_Internal {
    }

    public final static class ma_lcg_Internal {
    }

    public final static class ma_notch2_Internal {
    }

    public final static class ma_decoder_Internal {

        public final static class data_Internal {

            public final static class vfs_Internal {
            }

            public final static class memory_Internal {
            }
        }
    }

    public final static class ma_delay_node_config_Internal {
    }

    public final static class ma_bpf_Internal {
    }

    public final static class ma_engine_Internal {
    }

    public final static class ma_device_Internal {

        public final static class resampling_Internal {

            public final static class linear_Internal {
            }
        }

        public final static class playback_Internal {
        }

        public final static class capture_Internal {
        }

        public final static class coreaudio_Internal {
        }

        public final static class null_device_Internal {
        }
    }

    public final static class ma_audio_buffer_config_Internal {
    }

    public final static class ma_data_source_config_Internal {
    }

    public final static class ma_audio_buffer_ref_Internal {
    }

    public final static class ma_slot_allocator_config_Internal {
    }

    public final static class ma_channel_converter_Internal {

        public final static class weights_Internal {
        }
    }

    public final static class ma_slot_allocator_group_Internal {
    }

    public final static class ma_atomic_float_Internal {
    }

    public final static class ma_resource_manager_data_buffer_node_Internal {
    }

    public final static class ma_loshelf2_Internal {
    }

    public final static class ma_resampling_backend_vtable_Internal {

        public interface onGetHeapSize_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onGetHeapSize_call(VoidPointer pUserData, ma_resampler_config.ma_resampler_configPointer pConfig, ULongPointer pHeapSizeInBytes);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetHeapSize_call(new VoidPointer(buf.getNativePointer(0), false), new ma_resampler_config.ma_resampler_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ULongPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetHeapSize_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(ma_resampler_config.ma_resampler_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ULongPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onGetHeapSize> onGetHeapSize_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pConfig, pHeapSizeInBytes) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pHeapSizeInBytes.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onInit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInit_call(VoidPointer pUserData, ma_resampler_config.ma_resampler_configPointer pConfig, VoidPointer pHeap, PointerPointer<VoidPointer> ppBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInit_call(new VoidPointer(buf.getNativePointer(0), false), new ma_resampler_config.ma_resampler_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInit_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(ma_resampler_config.ma_resampler_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onInit> onInit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pConfig, pHeap, ppBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pHeap.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, ppBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onUninit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            void onUninit_call(VoidPointer pUserData, VoidPointer pBackend, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                onUninit_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                onUninit_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)));
            }

            public static CClosureObject<ma_resampling_backend_vtable.onUninit> onUninit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, pAllocationCallbacks) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pAllocationCallbacks.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface onProcess_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onProcess_call(VoidPointer pUserData, VoidPointer pBackend, VoidPointer pFramesIn, UInt64Pointer pFrameCountIn, VoidPointer pFramesOut, UInt64Pointer pFrameCountOut);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onProcess_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 40 : 20), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onProcess_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16)), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 40 : 20))).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onProcess> onProcess_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, pFramesIn, pFrameCountIn, pFramesOut, pFrameCountOut) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pFramesIn.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pFrameCountIn.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pFramesOut.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 40 : 20, pFrameCountOut.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 48 : 24));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onSetRate_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(22) };

            ma_result onSetRate_call(VoidPointer pUserData, VoidPointer pBackend, long sampleRateIn, long sampleRateOut);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onSetRate_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), buf.getUInt(CHandler.IS_64_BIT ? 20 : 12)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onSetRate_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), buf.getUInt(CHandler.IS_64_BIT ? 20 : 12)).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onSetRate> onSetRate_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, sampleRateIn, sampleRateOut) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, sampleRateIn);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 20 : 12, sampleRateOut);
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetInputLatency_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            long onGetInputLatency_call(VoidPointer pUserData, VoidPointer pBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setLong(0, onGetInputLatency_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setLong(0, onGetInputLatency_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))));
            }

            public static CClosureObject<ma_resampling_backend_vtable.onGetInputLatency> onGetInputLatency_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    encoder.invoke(bufPtr);
                    long _retPar = bufPtr.getLong(CHandler.IS_64_BIT ? 16 : 8);
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetOutputLatency_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            long onGetOutputLatency_call(VoidPointer pUserData, VoidPointer pBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setLong(0, onGetOutputLatency_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setLong(0, onGetOutputLatency_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))));
            }

            public static CClosureObject<ma_resampling_backend_vtable.onGetOutputLatency> onGetOutputLatency_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    encoder.invoke(bufPtr);
                    long _retPar = bufPtr.getLong(CHandler.IS_64_BIT ? 16 : 8);
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetRequiredInputFrameCount_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1) };

            ma_result onGetRequiredInputFrameCount_call(VoidPointer pUserData, VoidPointer pBackend, long outputFrameCount, UInt64Pointer pInputFrameCount);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetRequiredInputFrameCount_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetRequiredInputFrameCount_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, outputFrameCount, pInputFrameCount) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, outputFrameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pInputFrameCount.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onGetExpectedOutputFrameCount_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1) };

            ma_result onGetExpectedOutputFrameCount_call(VoidPointer pUserData, VoidPointer pBackend, long inputFrameCount, UInt64Pointer pOutputFrameCount);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetExpectedOutputFrameCount_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetExpectedOutputFrameCount_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onGetExpectedOutputFrameCount> onGetExpectedOutputFrameCount_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, inputFrameCount, pOutputFrameCount) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, inputFrameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pOutputFrameCount.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onReset_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onReset_call(VoidPointer pUserData, VoidPointer pBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onReset_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onReset_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
            }

            public static CClosureObject<ma_resampling_backend_vtable.onReset> onReset_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_node_base_Internal {
    }

    public final static class ma_sound_inlined_Internal {
    }

    public final static class ma_gainer_Internal {
    }

    public final static class ma_loshelf2_config_Internal {
    }

    public final static class ma_hishelf_node_config_Internal {
    }

    public final static class ma_semaphore_Internal {
    }

    public final static class ma_resource_manager_pipeline_stage_notification_Internal {
    }

    public final static class ma_resource_manager_data_buffer_Internal {

        public final static class connector_Internal {
        }
    }

    public final static class ma_hpf_node_config_Internal {
    }

    public final static class ma_bpf_node_Internal {
    }

    public final static class ma_data_converter_config_Internal {
    }

    public final static class ma_peak2_Internal {
    }

    public final static class ma_hpf1_config_Internal {
    }

    public final static class ma_vec3f_Internal {
    }

    public final static class ma_async_notification_callbacks_Internal {

        public interface onSignal_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

            void onSignal_call(VoidPointer pNotification);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                onSignal_call(new VoidPointer(buf.getNativePointer(0), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                onSignal_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)));
            }

            public static CClosureObject<ma_async_notification_callbacks.onSignal> onSignal_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pNotification) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pNotification.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_data_source_base_Internal {
    }

    public final static class ma_resource_manager_Internal {
    }

    public final static class ma_node_input_bus_Internal {
    }

    public final static class ma_peak_node_config_Internal {
    }

    public final static class ma_default_vfs_Internal {
    }

    public final static class ma_notch_node_config_Internal {
    }

    public final static class ma_sound_Internal {
    }

    public final static class ma_channel_converter_config_Internal {
    }

    public final static class ma_panner_Internal {
    }

    public final static class ma_linear_resampler_Internal {

        public final static class x0_Internal {
        }

        public final static class x1_Internal {
        }
    }

    public final static class ma_pcm_rb_Internal {
    }

    public final static class ma_node_graph_config_Internal {
    }

    public final static class ma_biquad_node_Internal {
    }

    public final static class ma_decoder_config_Internal {
    }

    public final static class ma_loshelf_node_config_Internal {
    }

    public final static class ma_log_callback_Internal {
    }

    public final static class ma_bpf_config_Internal {
    }

    public final static class ma_paged_audio_buffer_Internal {
    }

    public final static class ma_hishelf2_Internal {
    }

    public final static class ma_context_Internal {

        public final static class coreaudio_Internal {
        }

        public final static class null_backend_Internal {
        }

        public final static class posix_Internal {
        }
    }

    public final static class ma_biquad_config_Internal {
    }

    public final static class ma_biquad_coefficient_Internal {
    }

    public final static class ma_spatializer_config_Internal {
    }

    public final static class ma_paged_audio_buffer_data_Internal {
    }

    public final static class ma_encoder_config_Internal {
    }

    public final static class ma_encoder_Internal {

        public final static class data_Internal {

            public final static class vfs_Internal {
            }
        }
    }

    public final static class ma_resource_manager_data_source_Internal {

        public final static class backend_Internal {
        }
    }

    public final static class ma_context_config_Internal {

        public final static class dsound_Internal {
        }

        public final static class alsa_Internal {
        }

        public final static class pulse_Internal {
        }

        public final static class coreaudio_Internal {
        }

        public final static class jack_Internal {
        }
    }

    public final static class ma_resampler_Internal {

        public final static class state_Internal {
        }
    }

    public final static class ma_data_converter_Internal {
    }

    public final static class ma_resource_manager_config_Internal {
    }

    public final static class ma_sound_config_Internal {
    }

    public final static class ma_async_notification_poll_Internal {
    }

    public final static class ma_rb_Internal {
    }

    public final static class ma_atomic_uint64_Internal {
    }

    public final static class ma_spatializer_listener_config_Internal {
    }

    public final static class ma_vfs_callbacks_Internal {

        public interface onOpen_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

            ma_result onOpen_call(VoidPointer pVFS, BytePointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onOpen_call(new VoidPointer(buf.getNativePointer(0), false), new BytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onOpen_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(BytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onOpen> onOpen_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, pFilePath, openMode, pFile) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePath.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, openMode);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pFile.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onOpenW_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

            ma_result onOpenW_call(VoidPointer pVFS, SIntPointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onOpenW_call(new VoidPointer(buf.getNativePointer(0), false), new SIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onOpenW_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(SIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getUInt(CHandler.IS_64_BIT ? 16 : 8), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onOpenW> onOpenW_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, pFilePath, openMode, pFile) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePath.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 8, openMode);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pFile.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 16));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onClose_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onClose_call(VoidPointer pVFS, VoidPointer file);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onClose_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onClose_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onClose> onClose_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onRead_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

            ma_result onRead_call(VoidPointer pVFS, VoidPointer file, VoidPointer pDst, long sizeInBytes, ULongPointer pBytesRead);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onRead_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), buf.getNativeULong(CHandler.IS_64_BIT ? 24 : 12), new ULongPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onRead_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), buf.getNativeULong(CHandler.IS_64_BIT ? 24 : 12), manager.getPointing(ULongPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onRead> onRead_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file, pDst, sizeInBytes, pBytesRead) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDst.getPointer());
                    bufPtr.setNativeULong(CHandler.IS_64_BIT ? 24 : 12, sizeInBytes);
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16, pBytesRead.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onWrite_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

            ma_result onWrite_call(VoidPointer pVFS, VoidPointer file, VoidPointer pSrc, long sizeInBytes, ULongPointer pBytesWritten);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onWrite_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), buf.getNativeULong(CHandler.IS_64_BIT ? 24 : 12), new ULongPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onWrite_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), buf.getNativeULong(CHandler.IS_64_BIT ? 24 : 12), manager.getPointing(ULongPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onWrite> onWrite_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file, pSrc, sizeInBytes, pBytesWritten) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pSrc.getPointer());
                    bufPtr.setNativeULong(CHandler.IS_64_BIT ? 24 : 12, sizeInBytes);
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16, pBytesWritten.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onSeek_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(19), FFITypes.getCTypeInfo(29) };

            ma_result onSeek_call(VoidPointer pVFS, VoidPointer file, long offset, ma_seek_origin origin);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onSeek_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onSeek_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onSeek> onSeek_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file, offset, origin) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, offset);
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 24 : 16, origin.getIndex());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 28 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onTell_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onTell_call(VoidPointer pVFS, VoidPointer file, SInt64Pointer pCursor);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onTell_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new SInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onTell_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(SInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onTell> onTell_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file, pCursor) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pCursor.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onInfo_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInfo_call(VoidPointer pVFS, VoidPointer file, ma_file_info.ma_file_infoPointer pInfo);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInfo_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_file_info.ma_file_infoPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInfo_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_file_info.ma_file_infoPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8))).getIndex());
            }

            public static CClosureObject<ma_vfs_callbacks.onInfo> onInfo_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pVFS, file, pInfo) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pVFS.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pInfo.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 24 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_log_Internal {
    }

    public final static class ma_spatializer_Internal {
    }

    public final static class ma_splitter_node_Internal {
    }

    public final static class ma_resource_manager_data_stream_Internal {
    }

    public final static class ma_notch2_config_Internal {
    }

    public final static class ma_lpf_node_config_Internal {
    }

    public final static class ma_paged_audio_buffer_page_Internal {
    }

    public final static class ma_data_source_node_config_Internal {
    }

    public final static class ma_hpf1_Internal {
    }

    public final static class ma_node_graph_Internal {
    }

    public final static class ma_hpf2_Internal {
    }

    public final static class ma_biquad_node_config_Internal {
    }

    public final static class ma_node_config_Internal {
    }

    public final static class ma_device_notification_Internal {

        public final static class data_Internal {

            public final static class started_Internal {
            }

            public final static class stopped_Internal {
            }

            public final static class rerouted_Internal {
            }

            public final static class interruption_Internal {
            }
        }
    }

    public final static class ma_device_descriptor_Internal {
    }

    public final static class ma_pulsewave_Internal {
    }

    public final static class ma_bpf_node_config_Internal {
    }

    public final static class ma_panner_config_Internal {
    }

    public final static class ma_device_job_thread_config_Internal {
    }

    public final static class ma_hpf_Internal {
    }

    public final static class ma_atomic_bool32_Internal {
    }

    public final static class ma_lpf_Internal {
    }

    public final static class ma_file_info_Internal {
    }

    public final static class ma_device_id_Internal {

        public final static class custom_Internal {
        }
    }

    public final static class ma_device_config_Internal {

        public final static class playback_Internal {
        }

        public final static class capture_Internal {
        }

        public final static class wasapi_Internal {
        }

        public final static class alsa_Internal {
        }

        public final static class pulse_Internal {
        }

        public final static class coreaudio_Internal {
        }

        public final static class opensl_Internal {
        }

        public final static class aaudio_Internal {
        }
    }

    public final static class ma_peak2_config_Internal {
    }

    public final static class ma_linear_resampler_config_Internal {
    }

    public final static class ma_node_output_bus_Internal {
    }

    public final static class ma_device_job_thread_Internal {
    }

    public final static class ma_node_vtable_Internal {

        public interface onProcess_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            void onProcess_call(VoidPointer pNode, PointerPointer<FloatPointer> ppFramesIn, UIntPointer pFrameCountIn, PointerPointer<FloatPointer> ppFramesOut, UIntPointer pFrameCountOut);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                onProcess_call(new VoidPointer(buf.getNativePointer(0), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false, FloatPointer::new), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false, FloatPointer::new), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                onProcess_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), FloatPointer::new), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), FloatPointer::new), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16)));
            }

            public static CClosureObject<ma_node_vtable.onProcess> onProcess_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pNode, ppFramesIn, pFrameCountIn, ppFramesOut, pFrameCountOut) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pNode.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, ppFramesIn.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pFrameCountIn.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, ppFramesOut.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pFrameCountOut.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }

        public interface onGetRequiredInputFrameCount_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

            ma_result onGetRequiredInputFrameCount_call(VoidPointer pNode, long outputFrameCount, UIntPointer pInputFrameCount);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onGetRequiredInputFrameCount_call(new VoidPointer(buf.getNativePointer(0), false), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4), new UIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8), false)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onGetRequiredInputFrameCount_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4), manager.getPointing(UIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8))).getIndex());
            }

            public static CClosureObject<ma_node_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pNode, outputFrameCount, pInputFrameCount) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pNode.getPointer());
                    bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, outputFrameCount);
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 12 : 8, pInputFrameCount.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 12));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_fence_Internal {
    }

    public final static class ma_lpf_node_Internal {
    }

    public final static class ma_hpf_node_Internal {
    }

    public final static class ma_waveform_config_Internal {
    }

    public final static class ma_device_info_Internal {

        public final static class nativeDataFormats_Internal {
        }
    }

    public final static class ma_hishelf_node_Internal {
    }

    public final static class ma_event_Internal {
    }

    public final static class ma_engine_config_Internal {
    }

    public final static class ma_bpf2_Internal {
    }

    public final static class ma_noise_Internal {

        public final static class state_Internal {

            public final static class pink_Internal {
            }

            public final static class brownian_Internal {
            }
        }
    }

    public final static class ma_engine_node_Internal {

        public final static class fadeSettings_Internal {
        }
    }

    public final static class ma_duplex_rb_Internal {
    }

    public final static class ma_splitter_node_config_Internal {
    }

    public final static class ma_fader_config_Internal {
    }

    public final static class ma_resampler_config_Internal {

        public final static class linear_Internal {
        }
    }

    public final static class ma_stack_Internal {
    }

    public final static class ma_notch_node_Internal {
    }

    public final static class ma_peak_node_Internal {
    }

    public final static class ma_allocation_callbacks_Internal {

        public interface onMalloc_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

            VoidPointer onMalloc_call(long sz, VoidPointer pUserData);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setNativePointer(0, onMalloc_call(buf.getNativeULong(0), new VoidPointer(buf.getNativePointer((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 8 : 4), false)).getPointer());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setNativePointer(0, onMalloc_call(buf.getNativeULong(0), manager.getPointing(VoidPointer.class, buf.getNativePointer((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 8 : 4))).getPointer());
            }

            public static CClosureObject<ma_allocation_callbacks.onMalloc> onMalloc_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((sz, pUserData) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativeULong(0, sz);
                    bufPtr.setNativePointer((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 8 : 4, pUserData.getPointer());
                    encoder.invoke(bufPtr);
                    VoidPointer _retPar = new VoidPointer(bufPtr.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8), false);
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onRealloc_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

            VoidPointer onRealloc_call(VoidPointer p, long sz, VoidPointer pUserData);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setNativePointer(0, onRealloc_call(new VoidPointer(buf.getNativePointer(0), false), buf.getNativeULong(CHandler.IS_64_BIT ? 8 : 4), new VoidPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8), false)).getPointer());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setNativePointer(0, onRealloc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getNativeULong(CHandler.IS_64_BIT ? 8 : 4), manager.getPointing(VoidPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8))).getPointer());
            }

            public static CClosureObject<ma_allocation_callbacks.onRealloc> onRealloc_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p, sz, pUserData) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p.getPointer());
                    bufPtr.setNativeULong(CHandler.IS_64_BIT ? 8 : 4, sz);
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8, pUserData.getPointer());
                    encoder.invoke(bufPtr);
                    VoidPointer _retPar = new VoidPointer(bufPtr.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false);
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onFree_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            void onFree_call(VoidPointer p, VoidPointer pUserData);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                onFree_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                onFree_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)));
            }

            public static CClosureObject<ma_allocation_callbacks.onFree> onFree_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((p, pUserData) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, p.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pUserData.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_decoding_backend_vtable_Internal {

        public interface onInit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInit_call(VoidPointer pUserData, ClosureObject<GdxMiniaudio.ma_read_proc> onRead, ClosureObject<GdxMiniaudio.ma_seek_proc> onSeek, ClosureObject<GdxMiniaudio.ma_tell_proc> onTell, VoidPointer pReadSeekTellUserData, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInit_call(new VoidPointer(buf.getNativePointer(0), false), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), GdxMiniaudio_Internal.ma_read_proc_Internal::ma_read_proc_downcall), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), GdxMiniaudio_Internal.ma_seek_proc_Internal::ma_seek_proc_downcall), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), GdxMiniaudio_Internal.ma_tell_proc_Internal::ma_tell_proc_downcall), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false), new ma_decoding_backend_config.ma_decoding_backend_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 40 : 20), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 48 : 24), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 56 : 28), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInit_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), GdxMiniaudio_Internal.ma_read_proc_Internal::ma_read_proc_downcall), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), GdxMiniaudio_Internal.ma_seek_proc_Internal::ma_seek_proc_downcall), CHandler.getClosureObject(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), GdxMiniaudio_Internal.ma_tell_proc_Internal::ma_tell_proc_downcall), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16)), manager.getPointing(ma_decoding_backend_config.ma_decoding_backend_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 40 : 20)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 48 : 24)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 56 : 28), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_decoding_backend_vtable.onInit> onInit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, onRead, onSeek, onTell, pReadSeekTellUserData, pConfig, pAllocationCallbacks, ppBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onRead.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onSeek.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onTell.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pReadSeekTellUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 40 : 20, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 48 : 24, pAllocationCallbacks.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 56 : 28, ppBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 64 : 32));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onInitFile_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInitFile_call(VoidPointer pUserData, BytePointer pFilePath, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInitFile_call(new VoidPointer(buf.getNativePointer(0), false), new BytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_decoding_backend_config.ma_decoding_backend_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInitFile_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(BytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_decoding_backend_config.ma_decoding_backend_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_decoding_backend_vtable.onInitFile> onInitFile_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pFilePath, pConfig, pAllocationCallbacks, ppBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePath.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pAllocationCallbacks.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, ppBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 40 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onInitFileW_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInitFileW_call(VoidPointer pUserData, SIntPointer pFilePath, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInitFileW_call(new VoidPointer(buf.getNativePointer(0), false), new SIntPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_decoding_backend_config.ma_decoding_backend_configPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false), new PointerPointer<>(buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInitFileW_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(SIntPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_decoding_backend_config.ma_decoding_backend_configPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 12)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 32 : 16), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_decoding_backend_vtable.onInitFileW> onInitFileW_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pFilePath, pConfig, pAllocationCallbacks, ppBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePath.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pConfig.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pAllocationCallbacks.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 32 : 16, ppBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 40 : 20));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onInitMemory_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            ma_result onInitMemory_call(VoidPointer pUserData, VoidPointer pData, long dataSize, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                buf.setInt(0, onInitMemory_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), new ma_decoding_backend_config.ma_decoding_backend_configPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16), false), new PointerPointer<>(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 20), false, VoidPointer::new)).getIndex());
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                buf.setInt(0, onInitMemory_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(ma_decoding_backend_config.ma_decoding_backend_configPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16)), manager.getPointerPointer(PointerPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 20), VoidPointer::new)).getIndex());
            }

            public static CClosureObject<ma_decoding_backend_vtable.onInitMemory> onInitMemory_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pData, dataSize, pConfig, pAllocationCallbacks, ppBackend) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pData.getPointer());
                    bufPtr.setNativeULong(CHandler.IS_64_BIT ? 16 : 8, dataSize);
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, pConfig.getPointer());
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16, pAllocationCallbacks.getPointer());
                    bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 20, ppBackend.getPointer());
                    encoder.invoke(bufPtr);
                    ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 44 : 24));
                    encoder.finish(bufPtr);
                    return _retPar;
                }, fnPtr, encoder);
            }
        }

        public interface onUninit_Internal extends Closure {

            CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

            void onUninit_call(VoidPointer pUserData, VoidPointer pBackend, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks);

            default CTypeInfo[] functionSignature() {
                return __ffi_cache;
            }

            default void invoke(BufferPtr buf) {
                onUninit_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new ma_allocation_callbacks.ma_allocation_callbacksPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false));
            }

            default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
                onUninit_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_allocation_callbacks.ma_allocation_callbacksPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)));
            }

            public static CClosureObject<ma_decoding_backend_vtable.onUninit> onUninit_downcall(long fnPtr) {
                ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
                return new CClosureObject<>((pUserData, pBackend, pAllocationCallbacks) -> {
                    BufferPtr bufPtr = encoder.lockOrDuplicate();
                    bufPtr.setNativePointer(0, pUserData.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackend.getPointer());
                    bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pAllocationCallbacks.getPointer());
                    encoder.invoke(bufPtr);
                }, fnPtr, encoder);
            }
        }
    }

    public final static class ma_loshelf_node_Internal {
    }

    public final static class ma_hpf_config_Internal {
    }

    public final static class ma_lpf1_config_Internal {
    }

    public final static class ma_hishelf2_config_Internal {
    }

    public final static class ma_gainer_config_Internal {
    }

    public final static class ma_delay_Internal {
    }

    public final static class ma_atomic_vec3f_Internal {
    }

    public final static class ma_pulsewave_config_Internal {
    }

    public final static class ma_delay_config_Internal {
    }

    public final static class ma_spatializer_listener_Internal {
    }

    public final static class ma_slot_allocator_Internal {
    }

    public interface ma_encoder_uninit_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

        void ma_encoder_uninit_proc_call(ma_encoder.ma_encoderPointer pEncoder);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_encoder_uninit_proc_call(new ma_encoder.ma_encoderPointer(buf.getNativePointer(0), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_encoder_uninit_proc_call(manager.getPointing(ma_encoder.ma_encoderPointer.class, buf.getNativePointer(0)));
        }

        public static CClosureObject<GdxMiniaudio.ma_encoder_uninit_proc> ma_encoder_uninit_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pEncoder) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pEncoder.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_enum_devices_callback_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(13), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(29), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        long ma_enum_devices_callback_proc_call(ma_context.ma_contextPointer pContext, ma_device_type deviceType, ma_device_info.ma_device_infoPointer pInfo, VoidPointer pUserData);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setUInt(0, ma_enum_devices_callback_proc_call(new ma_context.ma_contextPointer(buf.getNativePointer(0), false), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), new ma_device_info.ma_device_infoPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12), false)));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setUInt(0, ma_enum_devices_callback_proc_call(manager.getPointing(ma_context.ma_contextPointer.class, buf.getNativePointer(0)), ma_device_type.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(ma_device_info.ma_device_infoPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 20 : 12))));
        }

        public static CClosureObject<GdxMiniaudio.ma_enum_devices_callback_proc> ma_enum_devices_callback_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pContext, deviceType, pInfo, pUserData) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pContext.getPointer());
                bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, deviceType.getIndex());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 12 : 8, pInfo.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 20 : 12, pUserData.getPointer());
                encoder.invoke(bufPtr);
                long _retPar = bufPtr.getUInt(CHandler.IS_64_BIT ? 28 : 16);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_encoder_write_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

        ma_result ma_encoder_write_proc_call(ma_encoder.ma_encoderPointer pEncoder, VoidPointer pBufferIn, long bytesToWrite, ULongPointer pBytesWritten);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_encoder_write_proc_call(new ma_encoder.ma_encoderPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), new ULongPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_encoder_write_proc_call(manager.getPointing(ma_encoder.ma_encoderPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(ULongPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_encoder_write_proc> ma_encoder_write_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pEncoder, pBufferIn, bytesToWrite, pBytesWritten) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pEncoder.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBufferIn.getPointer());
                bufPtr.setNativeULong(CHandler.IS_64_BIT ? 16 : 8, bytesToWrite);
                bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, pBytesWritten.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_decoder_seek_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(19), FFITypes.getCTypeInfo(29) };

        ma_result ma_decoder_seek_proc_call(ma_decoder.ma_decoderPointer pDecoder, long byteOffset, ma_seek_origin origin);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_decoder_seek_proc_call(new ma_decoder.ma_decoderPointer(buf.getNativePointer(0), false), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_decoder_seek_proc_call(manager.getPointing(ma_decoder.ma_decoderPointer.class, buf.getNativePointer(0)), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_decoder_seek_proc> ma_decoder_seek_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDecoder, byteOffset, origin) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDecoder.getPointer());
                bufPtr.setLong(CHandler.IS_64_BIT ? 8 : 4, byteOffset);
                bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 12, origin.getIndex());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_decoder_tell_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        ma_result ma_decoder_tell_proc_call(ma_decoder.ma_decoderPointer pDecoder, SInt64Pointer pCursor);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_decoder_tell_proc_call(new ma_decoder.ma_decoderPointer(buf.getNativePointer(0), false), new SInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_decoder_tell_proc_call(manager.getPointing(ma_decoder.ma_decoderPointer.class, buf.getNativePointer(0)), manager.getPointing(SInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_decoder_tell_proc> ma_decoder_tell_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDecoder, pCursor) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDecoder.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pCursor.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_engine_process_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23) };

        void ma_engine_process_proc_call(VoidPointer pUserData, FloatPointer pFramesOut, long frameCount);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_engine_process_proc_call(new VoidPointer(buf.getNativePointer(0), false), new FloatPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_engine_process_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(FloatPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8));
        }

        public static CClosureObject<GdxMiniaudio.ma_engine_process_proc> ma_engine_process_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, pFramesOut, frameCount) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFramesOut.getPointer());
                bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, frameCount);
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_encoder_init_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

        ma_result ma_encoder_init_proc_call(ma_encoder.ma_encoderPointer pEncoder);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_encoder_init_proc_call(new ma_encoder.ma_encoderPointer(buf.getNativePointer(0), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_encoder_init_proc_call(manager.getPointing(ma_encoder.ma_encoderPointer.class, buf.getNativePointer(0))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_encoder_init_proc> ma_encoder_init_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pEncoder) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pEncoder.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_encoder_write_pcm_frames_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(23), FFITypes.getCTypeInfo(-1) };

        ma_result ma_encoder_write_pcm_frames_proc_call(ma_encoder.ma_encoderPointer pEncoder, VoidPointer pFramesIn, long frameCount, UInt64Pointer pFramesWritten);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_encoder_write_pcm_frames_proc_call(new ma_encoder.ma_encoderPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), new UInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_encoder_write_pcm_frames_proc_call(manager.getPointing(ma_encoder.ma_encoderPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getLong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(UInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 24 : 16))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_encoder_write_pcm_frames_proc> ma_encoder_write_pcm_frames_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pEncoder, pFramesIn, frameCount, pFramesWritten) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pEncoder.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFramesIn.getPointer());
                bufPtr.setLong(CHandler.IS_64_BIT ? 16 : 8, frameCount);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pFramesWritten.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 32 : 20));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_seek_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(19), FFITypes.getCTypeInfo(29) };

        ma_result ma_seek_proc_call(VoidPointer pUserData, long offset, ma_seek_origin origin);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_seek_proc_call(new VoidPointer(buf.getNativePointer(0), false), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_seek_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_seek_proc> ma_seek_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, offset, origin) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setLong(CHandler.IS_64_BIT ? 8 : 4, offset);
                bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 12, origin.getIndex());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_sound_end_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        void ma_sound_end_proc_call(VoidPointer pUserData, ma_sound.ma_soundPointer pSound);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_sound_end_proc_call(new VoidPointer(buf.getNativePointer(0), false), new ma_sound.ma_soundPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_sound_end_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(ma_sound.ma_soundPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)));
        }

        public static CClosureObject<GdxMiniaudio.ma_sound_end_proc> ma_sound_end_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, pSound) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pSound.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_device_data_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22) };

        void ma_device_data_proc_call(ma_device.ma_devicePointer pDevice, VoidPointer pOutput, VoidPointer pInput, long frameCount);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_device_data_proc_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false), buf.getUInt(CHandler.IS_64_BIT ? 24 : 12));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_device_data_proc_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 16 : 8)), buf.getUInt(CHandler.IS_64_BIT ? 24 : 12));
        }

        public static CClosureObject<GdxMiniaudio.ma_device_data_proc> ma_device_data_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDevice, pOutput, pInput, frameCount) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDevice.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pOutput.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pInput.getPointer());
                bufPtr.setUInt(CHandler.IS_64_BIT ? 24 : 12, frameCount);
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_job_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1) };

        ma_result ma_job_proc_call(ma_job.ma_jobPointer pJob);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_job_proc_call(new ma_job.ma_jobPointer(buf.getNativePointer(0), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_job_proc_call(manager.getPointing(ma_job.ma_jobPointer.class, buf.getNativePointer(0))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_job_proc> ma_job_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pJob) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pJob.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 8 : 4));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_encoder_seek_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(19), FFITypes.getCTypeInfo(29) };

        ma_result ma_encoder_seek_proc_call(ma_encoder.ma_encoderPointer pEncoder, long offset, ma_seek_origin origin);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_encoder_seek_proc_call(new ma_encoder.ma_encoderPointer(buf.getNativePointer(0), false), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_encoder_seek_proc_call(manager.getPointing(ma_encoder.ma_encoderPointer.class, buf.getNativePointer(0)), buf.getLong(CHandler.IS_64_BIT ? 8 : 4), ma_seek_origin.getByIndex((int) buf.getUInt(CHandler.IS_64_BIT ? 16 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_encoder_seek_proc> ma_encoder_seek_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pEncoder, offset, origin) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pEncoder.getPointer());
                bufPtr.setLong(CHandler.IS_64_BIT ? 8 : 4, offset);
                bufPtr.setUInt(CHandler.IS_64_BIT ? 16 : 12, origin.getIndex());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 20 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_log_callback_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(22), FFITypes.getCTypeInfo(-1) };

        void ma_log_callback_proc_call(VoidPointer pUserData, long level, BytePointer pMessage);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_log_callback_proc_call(new VoidPointer(buf.getNativePointer(0), false), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4), new BytePointer(buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_log_callback_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), buf.getUInt(CHandler.IS_64_BIT ? 8 : 4), manager.getPointing(BytePointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 12 : 8)));
        }

        public static CClosureObject<GdxMiniaudio.ma_log_callback_proc> ma_log_callback_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, level, pMessage) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setUInt(CHandler.IS_64_BIT ? 8 : 4, level);
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 12 : 8, pMessage.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_read_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

        ma_result ma_read_proc_call(VoidPointer pUserData, VoidPointer pBufferOut, long bytesToRead, ULongPointer pBytesRead);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_read_proc_call(new VoidPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), new ULongPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_read_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(ULongPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_read_proc> ma_read_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, pBufferOut, bytesToRead, pBytesRead) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBufferOut.getPointer());
                bufPtr.setNativeULong(CHandler.IS_64_BIT ? 16 : 8, bytesToRead);
                bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, pBytesRead.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_device_notification_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

        void ma_device_notification_proc_call(ma_device_notification.ma_device_notificationPointer pNotification);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_device_notification_proc_call(new ma_device_notification.ma_device_notificationPointer(buf.getNativePointer(0), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_device_notification_proc_call(manager.getPointing(ma_device_notification.ma_device_notificationPointer.class, buf.getNativePointer(0)));
        }

        public static CClosureObject<GdxMiniaudio.ma_device_notification_proc> ma_device_notification_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pNotification) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pNotification.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_tell_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        ma_result ma_tell_proc_call(VoidPointer pUserData, SInt64Pointer pCursor);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_tell_proc_call(new VoidPointer(buf.getNativePointer(0), false), new SInt64Pointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_tell_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0)), manager.getPointing(SInt64Pointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_tell_proc> ma_tell_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pUserData, pCursor) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pUserData.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pCursor.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(CHandler.IS_64_BIT ? 16 : 8));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_decoder_read_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(12), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(27), FFITypes.getCTypeInfo(-1) };

        ma_result ma_decoder_read_proc_call(ma_decoder.ma_decoderPointer pDecoder, VoidPointer pBufferOut, long bytesToRead, ULongPointer pBytesRead);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setInt(0, ma_decoder_read_proc_call(new ma_decoder.ma_decoderPointer(buf.getNativePointer(0), false), new VoidPointer(buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), new ULongPointer(buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false)).getIndex());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setInt(0, ma_decoder_read_proc_call(manager.getPointing(ma_decoder.ma_decoderPointer.class, buf.getNativePointer(0)), manager.getPointing(VoidPointer.class, buf.getNativePointer(CHandler.IS_64_BIT ? 8 : 4)), buf.getNativeULong(CHandler.IS_64_BIT ? 16 : 8), manager.getPointing(ULongPointer.class, buf.getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12))).getIndex());
        }

        public static CClosureObject<GdxMiniaudio.ma_decoder_read_proc> ma_decoder_read_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDecoder, pBufferOut, bytesToRead, pBytesRead) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDecoder.getPointer());
                bufPtr.setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBufferOut.getPointer());
                bufPtr.setNativeULong(CHandler.IS_64_BIT ? 16 : 8, bytesToRead);
                bufPtr.setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, pBytesRead.getPointer());
                encoder.invoke(bufPtr);
                ma_result _retPar = ma_result.getByIndex((int) bufPtr.getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 28 : 16));
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_stop_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2), FFITypes.getCTypeInfo(-1) };

        void ma_stop_proc_call(ma_device.ma_devicePointer pDevice);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_stop_proc_call(new ma_device.ma_devicePointer(buf.getNativePointer(0), false));
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_stop_proc_call(manager.getPointing(ma_device.ma_devicePointer.class, buf.getNativePointer(0)));
        }

        public static CClosureObject<GdxMiniaudio.ma_stop_proc> ma_stop_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDevice) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDevice.getPointer());
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }

    public interface ma_data_source_get_next_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-1), FFITypes.getCTypeInfo(-1) };

        VoidPointer ma_data_source_get_next_proc_call(VoidPointer pDataSource);

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            buf.setNativePointer(0, ma_data_source_get_next_proc_call(new VoidPointer(buf.getNativePointer(0), false)).getPointer());
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            buf.setNativePointer(0, ma_data_source_get_next_proc_call(manager.getPointing(VoidPointer.class, buf.getNativePointer(0))).getPointer());
        }

        public static CClosureObject<GdxMiniaudio.ma_data_source_get_next_proc> ma_data_source_get_next_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>((pDataSource) -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                bufPtr.setNativePointer(0, pDataSource.getPointer());
                encoder.invoke(bufPtr);
                VoidPointer _retPar = new VoidPointer(bufPtr.getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                encoder.finish(bufPtr);
                return _retPar;
            }, fnPtr, encoder);
        }
    }

    public interface ma_proc_Internal extends Closure {

        CTypeInfo[] __ffi_cache = new CTypeInfo[] { FFITypes.getCTypeInfo(-2) };

        void ma_proc_call();

        default CTypeInfo[] functionSignature() {
            return __ffi_cache;
        }

        default void invoke(BufferPtr buf) {
            ma_proc_call();
        }

        default void invokePooled(BufferPtr buf, PointingPoolManager manager) {
            ma_proc_call();
        }

        public static CClosureObject<GdxMiniaudio.ma_proc> ma_proc_downcall(long fnPtr) {
            ClosureEncoder encoder = new ClosureEncoder(fnPtr, __ffi_cache);
            return new CClosureObject<>(() -> {
                BufferPtr bufPtr = encoder.lockOrDuplicate();
                encoder.invoke(bufPtr);
            }, fnPtr, encoder);
        }
    }
}
