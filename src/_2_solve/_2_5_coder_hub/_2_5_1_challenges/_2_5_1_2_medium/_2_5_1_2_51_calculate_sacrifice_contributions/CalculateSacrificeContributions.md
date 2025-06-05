# <div dir="rtl">تكلفة أضحية عائلة طويق</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
في صباح عيد الأضحى المبارك، اجتمعت عائلة طويق الكبيرة لتشتري معًا أضحية كبيرة واحدة، ثم اتفق أفراد العائلة على مشاركة تكلفة الشراء طبقًا لحصصهم المئوية.
لديك الآن:

قائمة بأسماء أفراد عائلة طويق.

قائمة بنسب المساهمة لكل منهم (كسور عشرية ومجموعها 1).

التكلفة الإجمالية للأضحية بالكيلو (بريالات).

مهمتك هي كتابة دالة calculateSacrificeContributions التي توزع التكلفة على أفراد العائلة حسب حصصهم، وتعيد مصفوفة توضح ما يدفعه كل فرد (قيمة مقربة إلى منزلتين عشريتين).

المدخلات:

names (string[]): أسماء أفراد العائلة.

shares (float[]): نسب مساهمتهم (كسور عشرية) بحيث
∑shares[i]=1\sum shares[i] = 1∑shares[i]=1.

totalCost (float): إجمالي تكلفة الأضحية بالريال.

الإخراج:
مصفوفة (float[]) بحجم names.length، حيث يكون العنصر iii هو

round(shares[i]×totalCost,  2) \text{round}(shares[i] \times totalCost,\;2)round(shares[i]×totalCost,2)

أي نصيب كل فرد من التكلفة، مقربًا إلى منزلتين عشريتين.

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
names = ['أحمد', 'سارة']
shares = [0.5, 0.5]
totalCost = 200
```

#### <div dir="rtl">المُخرجات</div>

```text
[100,100]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
names = ['علي', 'منى', 'عمر']
shares = [0.4, 0.4, 0.2]
totalCost = 500
```

#### <div dir="rtl">المُخرجات</div>

```text
[200,200,100]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
names = ['خالد']
shares = [1]
totalCost = 750
```

#### <div dir="rtl">المُخرجات</div>

```text
[750]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
names = ['ليلى', 'هند']
shares = [0.3, 0.7]
totalCost = 300
```

#### <div dir="rtl">المُخرجات</div>

```text
[90,210]
```