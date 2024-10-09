# <div dir="rtl">مطابقة مصفوفتين</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل مصفوفتين arrays من نوع string وتقوم بإرجاع قيمة true أو false اعتمادا على مطابقة جميع الكلمات في المصفوفة array2 مع الكلمات الموجودة في الـمصفوفة array1.
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
array1 = [hello, there, word2]
array2 = [hello, there, word2]
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
array1 = [hello, word2]
array2 = [hello, there, word2]
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
array1 = [hello, there, word2]
array2 = [hello, word2]
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
array1 = [hello, there, word2]
array2 = [word2, there, hello]
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```