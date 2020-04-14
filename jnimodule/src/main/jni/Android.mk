LOCAL_PATH      := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE    := str_module
LOCAL_SRC_FILES := str_module.cpp

include $(BUILD_SHARED_LIBRARY)