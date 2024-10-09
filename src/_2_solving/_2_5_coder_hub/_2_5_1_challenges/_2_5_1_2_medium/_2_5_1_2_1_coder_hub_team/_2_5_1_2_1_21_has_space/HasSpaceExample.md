# <div dir="rtl">التحقق من وجود مسافة في الجملة</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل قيمة نصية من نوع string تقوم الدالة function بالتحقق مما اذا كانت توجد مسافة space في النص أم لا في حال وجود مسافة استبدل كل مسافة space بعلامة # ثم تقوم الدالة بإرجاع النتيجة من نوع string
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
strParam = Riyadh
```

#### <div dir="rtl">المُخرجات</div>

```text
Riyadh
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
strParam = Saudi Arabia
```

#### <div dir="rtl">المُخرجات</div>

```text
Saudi#Arabia
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
strParam = CoderHub
```

#### <div dir="rtl">المُخرجات</div>

```text
CoderHub
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
strParam = What do you do?
```

#### <div dir="rtl">المُخرجات</div>

```text
What#do#you#do?
```