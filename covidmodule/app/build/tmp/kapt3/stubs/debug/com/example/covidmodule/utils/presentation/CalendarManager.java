package com.example.covidmodule.utils.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/covidmodule/utils/presentation/CalendarManager;", "", "()V", "Companion", "covidmodule_debug"})
public final class CalendarManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.covidmodule.utils.presentation.CalendarManager.Companion Companion = null;
    private static final java.util.Calendar calendar = null;
    private static int year = 0;
    private static int month = 0;
    private static int day = 0;
    
    public CalendarManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/covidmodule/utils/presentation/CalendarManager$Companion;", "", "()V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "day", "", "month", "year", "calendarInstance", "", "dateFormatToString", "", "monthOfYear", "dayOfMonth", "getDateTime", "", "pickerInstance", "context", "Landroid/content/Context;", "onSuccess", "Lkotlin/Function1;", "showPickerDialog", "covidmodule_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showPickerDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSuccess) {
        }
        
        private final void calendarInstance() {
        }
        
        private final void pickerInstance(android.content.Context context, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSuccess) {
        }
        
        private final java.lang.String dateFormatToString(int year, int monthOfYear, int dayOfMonth) {
            return null;
        }
        
        private final long getDateTime() {
            return 0L;
        }
    }
}