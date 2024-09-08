# <div dir="rtl">مصفوفة تحتوي على بداية ذات الكلمة</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بإنشاء function تستقبل قيمة نصية String تحتوي على جزء من بداية كلمة، ومصفوفة Array تحتوي على عدة كلمات. تقوم الدالة بإرجاع مصفوفة تحتوي على الكلمات التي تبدأ بنفس النص الذي تم تمريره. إن لم تحتوي المصفوفة على شيء مطابق، فقم بإرجاع مصفوفة فيها القيمة النصيّة No matches found.
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
words = [Nouf, Abdullah]
text = Gh
```

#### <div dir="rtl">المُخرجات</div>

```text
[No matches found]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
words = [Reassemble, Remainder, Room, Receive]
text = re
```

#### <div dir="rtl">المُخرجات</div>

```text
[Reassemble,Remainder,Receive]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
words = [Compared, Coding, Career, Coderhub, Cold, Call]
text = co
```

#### <div dir="rtl">المُخرجات</div>

```text
[Compared,Coding,Coderhub,Cold]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
words = [Save, Saudi, Satr, Send, Salt, Super, Sample]
text = sa
```

#### <div dir="rtl">المُخرجات</div>

```text
[Save,Saudi,Satr,Salt,Sample]
```