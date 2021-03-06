package my.core.repetition.stringlists;

/**
 * User: mtitov
 * Date: 3/17/12
 * Time: 5:45 PM
 */
public enum PuzataHataFood implements StringTypeInterface{

    ALL(getAll()), A_ZAKUSKI(getZakuski()), B_SALATY(getSalaty()), C_PERVYE_BLJUDA(getPervyeBljuda()),
    D_MJASNYE_BLJUDA(getMjasnyeBljuda()), E_RYBNYE_BLJUDA(getRybnyeBljuda()), F_BLJUDA_IZ_KURICY(getBljudaIzKuricy()),
    G_GARNIRY(getGarniry()), H_MUCHNYE_IZDELIJA(getMuchnyeIzdelija()), I_DESERTY(getDeserty());

    PuzataHataFood(String[] list) {
        this.list = list;
    }

    public String[] getList() {
        return list;
    }

    private String[] list;

    public static String[] getAll() {
        return StringListHolder.all;
    }

    public static String[] getZakuski() {
        return StringListHolder.zakuski;
    }

    public static String[] getSalaty() {
        return StringListHolder.salaty;
    }

    public static String[] getPervyeBljuda() {
        return StringListHolder.pervyeBljuda;
    }

    public static String[] getMjasnyeBljuda() {
        return StringListHolder.mjasnyeBljuda;
    }

    public static String[] getRybnyeBljuda() {
        return StringListHolder.rybnyeBljuda;
    }

    public static String[] getBljudaIzKuricy() {
        return StringListHolder.bljudaIzKuricy;
    }

    public static String[] getGarniry() {
        return StringListHolder.garniry;
    }

    public static String[] getMuchnyeIzdelija() {
        return StringListHolder.muchnyeIzdelija;
    }

    public static String[] getDeserty() {
        return StringListHolder.deserty;
    }

    private static class StringListHolder {

        public static String[] all = {
                "Икра кабачковая ",
                "Закуска острая ",
                "Огурец малосольный ",
                "Сельдь с луком ",
                "Селедка под шубой ",
                "Помидор соленый ",
                "Сало с чесноком ",
                "Торт из кабачков",
                "Сендвич с курицей и овощами-гриль ",
                "Сендвич с лососем ",
                "Сендвич с ветчиной и сыром",
                "Салат сезона (капуста+огурец)",
                "Салат южный",
                "Салат из свежих огурцов со сметаной",
                "Салат из свежих овощей",
                "Салат с курицей и овощами",
                "Салат из моркови и сельдерея",
                "Салат с брынзой",
                "Салат с ветчиной",
                "Салат Мимоза",
                "Салат Оливье",
                "Салат с копчёной курицей и спаржей",
                "Салат Цезарь с курицей",
                "Салат Греческий",
                "Салат-фреш Греческий",
                "Салат-фреш с курицей",
                "Салат-фреш с тунцом",
                "Салат из языка",
                "Борщ украинский",
                "Борщ зелёный",
                "Бульон куриный",
                "Окрошка",
                "Солянка мясная",
                "Суп-пюре с грибами",
                "Суп овощной",
                "Уха из рыбы",
                "Биточки по-селянски",
                "Кабачки фаршированные мясом",
                "Бризол фирменный",
                "Отбивная из свинины",
                "Голубцы с мясом",
                "Колбаса домашняя",
                "Колбаса куриная",
                "Кордон-блю",
                "Колбаски охотничьи",
                "Котлета домашняя",
                "Котлета мясная с сулугуни",
                "Котлета Садко",
                "Бифштекс с яйцом",
                "Печень жареная",
                "Свинина тушеная с черносливом",
                "Стейк из телятины",
                "Стейк из свинины",
                "Телятина отварная",
                "Тефтели мясные",
                "Шашлык из свинины",
                "Говядина в сыре",
                "Отбивная рыбная под маринадом",
                "Бризоль рыбный",
                "Котлета рыбная Бужок",
                "Котлета рыбная с маслом",
                "Котлета рыбная паровая",
                "Котлета рыбная в хлопьях",
                "Котлета рыбная в сыре и кунжуте",
                "Крученик рыбный",
                "Лосось запеченный",
                "Лосось жареный",
                "Лосось запеченный с зелёным маслом",
                "Рыба с овощами",
                "Рыба по-итальянски",
                "Рыба жареная",
                "Рыба запеченная с картошкой и грибами",
                "Рыба масляная в кунжуте",
                "Риба с кабачком в яйце",
                "Колбаса куриная",
                "Котлета куриная с овощами и грибами",
                "Котлета куриная паровая с овощами",
                "Котлета куриная по-домашнему",
                "Котлета по-киевски",
                "Курица запеченная с картофелем",
                "Куриная отбивная под сыром",
                "Куриные крылышки в маринаде",
                "Куриные крылышки жареные",
                "Куриные окорочка жареные",
                "Куриная ножка с грибами в сыре",
                "Стейк куриный",
                "Тефтели куриные",
                "Шашлык куриный",
                "Паста с копченностями и сладким перцем",
                "Баклажаны с курицей",
                "Гречка",
                "Гуляш с грибами и овощами",
                "Капуста тушеная",
                "Картофель вареный",
                "Картофель по-полтавски",
                "Картофель жареный",
                "Картофельное пюре по-домашнему",
                "Фасоль с овощами и грибами",
                "Макароны в соусе",
                "Кабачки тушеные",
                "Овощи бланшированные",
                "Овощи гриль",
                "Перец фаршированный мясом",
                "Шампиньоны в сметане",
                "Рагу овощное",
                "Рис с морепродуктами",
                "Рис с овощами",
                "Рис с грибами",
                "Соте",
                "Булочка (фирменная, украинская)",
                "Сырники",
                "Вареники с вишнями",
                "Вареники с капустой",
                "Вареники с картошкой",
                "Вареники с мясом",
                "Пирог печеный с начинкой",
                "Блины с маком",
                "Блинчики с мясом",
                "Блины с творогом",
                "Блины с яблоками",
                "Блинчики с мясом в яйце",
                "Пампушки",
                "Слойка с грибами",
                "Пирожок с капустой",
                "Пирожок с мясом",
                "Пирожок с вишнями",
                "Пирожок жареный с капустой",
                "Пирожок жареный с картофелем",
                "Пирожок жареный с мясом",
                "Пельмени с курицей",
        };

        public static String[] zakuski = {
                "Жюльен с грибами и курицей ",
                "Закуска острая ",
                "Огурец соленый ",
                "Сельдь с луком ",
                "Селедка под шубой ",
                "Помидор соленый ",
                "Сало с чесноком ",
                "Торт из кабачков",
        };

        public static String[] salaty = {
                "Салат Винегрет",
                "Салат из грибов",
                "Салат из квашеной капусты",
                "Салат с крабовыми палочками",
                "Салат с курицей и ананасом",
                "Салат с курицей и грибами",
                "Салат из моркови и сельдерея",
                "Салат из краснокочанной капусты",
                "Салат с ветчиной",
                "Салат Лососевый",
                "Салат Морковь по-корейски",
                "Салат Мимоза",
                "Салат Оливье",
                "Салат Спаржевый",
                "Салат Цезарь с курицей",
                "Салат-фреш Греческий",
                "Салат-фреш с курицей",
                "Салат-фреш с тунцом"
        };

        public static String[] pervyeBljuda = {
                "Борщ украинский",
                "Бульон куриный с лапшой",
                "Рассольник",
                "Солянка мясная",
                "Суп гороховый",
                "Суп овощной",
                "Юшка грибная с фасолью",
                "Уха из рыбы"
        };

        public static String[] mjasnyeBljuda = {
                "Биточки по-селянски",
                "Бигус",
                "Бризол фирменный",
                "Отбивная из свинины",
                "Голубцы с мясом",
                "Колбаса домашняя",
                "Колбаски охотничьи",
                "Котлета домашняя",
                "Котлета мясная с сулугуни",
                "Котлета полтавская",
                "Котлета Садко",
                "Жаркое по-домашнему",
                "Печень жареная",
                "Ребра жареные",
                "Сосиски вареные",
                "Стейк из телятины",
                "Стейк из свинины",
                "Телятина отварная",
                "Тефтели мясные",
                "Шашлык из свинины",
                "Говядина в сыре"
        };

        public static String[] rybnyeBljuda = {
                "Бризоль рыбный",
                "Котлета рыбная Бужок",
                "Котлета рыбная с маслом",
                "Котлета рыбная паровая",
                "Котлета рыбная жареная",
                "Крученик рыбный",
                "Лосось запеченный",
                "Рыба с овощами",
                "Рыба под маринадом",
                "Рыба по-итальянски",
                "Рыба жареная",
                "Стейки из лосося",
                "Скумбрия припущенная"
        };

        public static String[] bljudaIzKuricy = {
                "Колбаса куриная",
                "Котлета куриная с овощами и грибами",
                "Котлета куриная с сыром",
                "Котлета куриная паровая",
                "Котлета куриная по-домашнему",
                "Котлета по-киевски",
                "Крученик куриный с омлетом",
                "Курица запеченная с картофелем",
                "Куриная отбивная под сыром",
                "Куриные крылышки в маринаде",
                "Куриные крылышки жареные",
                "Куриные потрошки в сливочном соусе",
                "Куриные окорочка жареные",
                "Печень куриная жареная",
                "Стейк куриный",
                "Тефтели куриные",
                "Шашлык куриный"
        };

        public static String[] garniry = {
                "Баклажаны с курицей",
                "Гречка",
                "Грибы жареные",
                "Гуляш с мясом",
                "Капуста тушеная",
                "Картофель вареный",
                "Картофель по-полтавски",
                "Картофель жареный",
                "Фасоль с овощами и грибами",
                "Макароны в соусе",
                "Овощи бланшированные",
                "Овощи с беконом",
                "Перец фаршированный мясом",
                "Шампиньоны в сметане",
                "Плов",
                "Рагу овощное",
                "Рис",
                "Рис с морепродуктами",
                "Рис с овощами",
                "Соте"
        };

        public static String[] muchnyeIzdelija = {
                "Сырники",
                "Вареники с вишнями",
                "Вареники с капустой",
                "Вареники с картошкой",
                "Вареники с мясом",
                "Зразы картофельные с капустой и грибами",
                "Блины с маком",
                "Блинчики с мясом",
                "Блины с творогом",
                "Блины с яблоками",
                "Блинчики с мясом в яйце",
                "Пирожок с капустой",
                "Пирожок с мясом (печенью)",
                "Пирожок с вишнями",
                "Пирожок жареный с капустой",
                "Пирожок жареный с картофелем",
                "Пирожок жареный с мясом",
                "Пирожок жареный с печенью и картофелем"
        };

        public static String[] deserty = {
                "Десерт с черносливом ",
                "Желе",
                "Кекс",
                "Круассан",
                "Крученик (с маком, повидлом) ",
                "Мороженое с топингом ",
                "Печенье в ассортименте ",
                "Пирог лимонный ",
                "Пирог яблочный ",
                "Пирог ягодный ",
                "Рулет с маком ",
                "Слойка большая в ассортименте ",
                "Пирожное Вишенка ",
                "Пирожное Эклер шоколадный ",
                "Пирожное Зебра ",
                "Пирожное Корзинка с виноградом ",
                "Пирожное Корзинка с черносливом ",
                "Пирожное Корзинка с ягодами ",
                "Пирожное мышонке ",
                "Пирожное Монастырская изба ",
                "Пирожное Наполеон ",
                "Пирожное Сметанник ",
                "Пирожное Фруктовый рай ",
                "Торт вафельный ",
                "Торт Венский ",
                "Торт Ореховый ",
                "Торт желейный ",
                "Торт Йогуртовый ",
                "Торт Капучино ",
                "Торт Медовик ",
                "Торт Прага ",
                "Торт Птичье молоко ",
                "Торт Пьяная вишня ",
                "Торт Сырковый ",
                "Торт Сметанный ",
                "Торт Чиз кейк ",
                "Торт Шоколадный ",
                "торт Шоколадница"
        };

    }

}
