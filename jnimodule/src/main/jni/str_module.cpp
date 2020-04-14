//
// Created by lemi0006 on 2020-04-14.
//
#include "com_treetrunks_jnimodule_JNIClass.h"

JNIEXPORT jstring JNICALL Java_com_treetrunks_jnimodule_JNIClass_getNumString
  (JNIEnv * m_jniEnv, jobject m_jObj, jstring str, jint num) {
        jclass cls = m_jniEnv->GetObjectClass(m_jObj);
        jmethodID func = m_jniEnv->GetMethodID(cls, "callback", "(Ljava/lang/String;I)Ljava/lang/String;");
        return (jstring)m_jniEnv->CallObjectMethod(m_jObj, func, str, num);
  }