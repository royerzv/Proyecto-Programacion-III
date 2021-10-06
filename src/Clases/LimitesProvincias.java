package Clases;

import java.awt.*;

public class LimitesProvincias {

    Polygon herediaProv, sanJoseProv, alajuelaProv, cartagoProv, guanacasteProv, limonProv, puntareanasProv;

    public LimitesProvincias(){

        herediaProv = new Polygon();
        sanJoseProv = new Polygon();
        alajuelaProv = new Polygon();
        cartagoProv = new Polygon();
        guanacasteProv = new Polygon();
        limonProv = new Polygon();
        puntareanasProv = new Polygon();

        //PUNTOS HEREDIA
        herediaProv.addPoint(235,65);
        herediaProv.addPoint(235,105);
        herediaProv.addPoint(235,137);
        herediaProv.addPoint(232,165);
        herediaProv.addPoint(250,158);
        herediaProv.addPoint(243,142);
        herediaProv.addPoint(259,135);
        herediaProv.addPoint(270,116);
        herediaProv.addPoint(274,94);
        herediaProv.addPoint(273,81);
        herediaProv.addPoint(285,69);
        herediaProv.addPoint(263, 73);
        herediaProv.addPoint(235,65);


        //PUNTOS SAN JOSE

        sanJoseProv.addPoint(260,140);
        sanJoseProv.addPoint(248, 145);
        sanJoseProv.addPoint(255, 159);
        sanJoseProv.addPoint(251,166);
        sanJoseProv.addPoint(230,170);
        sanJoseProv.addPoint(190,179);
        sanJoseProv.addPoint(182,196);
        sanJoseProv.addPoint(188,214);
        sanJoseProv.addPoint(200,208);
        sanJoseProv.addPoint(238,210);
        sanJoseProv.addPoint(293,263);
        sanJoseProv.addPoint(311,279);
        sanJoseProv.addPoint(324,243);
        sanJoseProv.addPoint(299,222);
        sanJoseProv.addPoint(289,225);
        sanJoseProv.addPoint(242,195);
        sanJoseProv.addPoint(250,180);
        sanJoseProv.addPoint(246,177);
        sanJoseProv.addPoint(243,173);
        sanJoseProv.addPoint(268,165);
        sanJoseProv.addPoint(261,152);
        sanJoseProv.addPoint(260,140);



        //PUNTOS LIMON

        limonProv.addPoint(298,52);
        limonProv.addPoint(294,76);
        limonProv.addPoint(280,81);
        limonProv.addPoint(277,124);
        limonProv.addPoint(265,142);
        limonProv.addPoint(305,162);
        limonProv.addPoint(343,164);
        limonProv.addPoint(323,233);
        limonProv.addPoint(361,249);
        limonProv.addPoint(387,277);
        limonProv.addPoint(386,230);
        limonProv.addPoint(401,209);
        limonProv.addPoint(428,233);
        limonProv.addPoint(395,195);
        limonProv.addPoint(350,142);
        limonProv.addPoint(298,52);


        //PUNTOS ALAJUELA

        alajuelaProv.addPoint(230,65);
        alajuelaProv.addPoint(224,164);
        alajuelaProv.addPoint(172,176);
        alajuelaProv.addPoint(186,161);
        alajuelaProv.addPoint(171,126);
        alajuelaProv.addPoint(156,98);
        alajuelaProv.addPoint(106,60);
        alajuelaProv.addPoint(75,46);
        alajuelaProv.addPoint(97,28);
        alajuelaProv.addPoint(137,44);
        alajuelaProv.addPoint(167,26);
        alajuelaProv.addPoint(204,40);
        alajuelaProv.addPoint(230,65);



        //PUNTOS GUANACASTE

        guanacasteProv.addPoint(51,9);
        guanacasteProv.addPoint(38,44);
        guanacasteProv.addPoint(18,46);
        guanacasteProv.addPoint(42,57);
        guanacasteProv.addPoint(47,83);
        guanacasteProv.addPoint(20,117);
        guanacasteProv.addPoint(44,171);
        guanacasteProv.addPoint(96,194);
        guanacasteProv.addPoint(84,169);
        guanacasteProv.addPoint(102,159);
        guanacasteProv.addPoint(75,120);
        guanacasteProv.addPoint(90,121);
        guanacasteProv.addPoint(133,142);
        guanacasteProv.addPoint(139,122);
        guanacasteProv.addPoint(153,106);
        guanacasteProv.addPoint(88,66);
        guanacasteProv.addPoint(67,44);
        guanacasteProv.addPoint(92,25);
        guanacasteProv.addPoint(51,9);


        //PUNTOS PUNTARENAS


        puntareanasProv.addPoint(111, 217);
        puntareanasProv.addPoint(108, 210);
        puntareanasProv.addPoint(99, 199);
        puntareanasProv.addPoint(104, 192);
        puntareanasProv.addPoint(106, 181);
        puntareanasProv.addPoint(99, 173);
        puntareanasProv.addPoint(89, 172);
        puntareanasProv.addPoint(93, 169);
        puntareanasProv.addPoint(106, 165);
        puntareanasProv.addPoint(106, 153);
        puntareanasProv.addPoint(103, 151);
        puntareanasProv.addPoint(103, 147);
        puntareanasProv.addPoint(112, 150);
        puntareanasProv.addPoint(107, 153);
        puntareanasProv.addPoint(107, 165);
        puntareanasProv.addPoint(120, 168);
        puntareanasProv.addPoint(120, 143);
        puntareanasProv.addPoint(128, 143);
        puntareanasProv.addPoint(136, 149);
        puntareanasProv.addPoint(145, 138);
        puntareanasProv.addPoint(145, 124);
        puntareanasProv.addPoint(150, 121);
        puntareanasProv.addPoint(159, 130);
        puntareanasProv.addPoint(167, 127);
        puntareanasProv.addPoint(170, 132);
        puntareanasProv.addPoint(167, 136);
        puntareanasProv.addPoint(167, 148);
        puntareanasProv.addPoint(179, 164);
        puntareanasProv.addPoint(167, 175);
        puntareanasProv.addPoint(168, 179);
        puntareanasProv.addPoint(176, 182);
        puntareanasProv.addPoint(183, 192);
        puntareanasProv.addPoint(177, 193);
        puntareanasProv.addPoint(184, 218);
        puntareanasProv.addPoint(201, 219);
        puntareanasProv.addPoint(205, 212);
        puntareanasProv.addPoint(234, 213);
        puntareanasProv.addPoint(235, 221);
        puntareanasProv.addPoint(243, 222);
        puntareanasProv.addPoint(243, 227);
        puntareanasProv.addPoint(261, 243);
        puntareanasProv.addPoint(265, 241);
        puntareanasProv.addPoint(272, 250);
        puntareanasProv.addPoint(274, 259);
        puntareanasProv.addPoint(284, 265);
        puntareanasProv.addPoint(288, 263);
        puntareanasProv.addPoint(293, 267);
        puntareanasProv.addPoint(295, 274);
        puntareanasProv.addPoint(308, 282);
        puntareanasProv.addPoint(316, 285);
        puntareanasProv.addPoint(322, 279);
        puntareanasProv.addPoint(323, 267);
        puntareanasProv.addPoint(319, 265);
        puntareanasProv.addPoint(325, 250);
        puntareanasProv.addPoint(336, 250);
        puntareanasProv.addPoint(341, 246);
        puntareanasProv.addPoint(350, 252);
        puntareanasProv.addPoint(360, 253);
        puntareanasProv.addPoint(371, 364);
        puntareanasProv.addPoint(372, 273);
        puntareanasProv.addPoint(379, 275);
        puntareanasProv.addPoint(384, 283);
        puntareanasProv.addPoint(406, 293);
        puntareanasProv.addPoint(416, 299);
        puntareanasProv.addPoint(407, 306);
        puntareanasProv.addPoint(395, 311);
        puntareanasProv.addPoint(390, 325);
        puntareanasProv.addPoint(400, 339);
        puntareanasProv.addPoint(400, 359);
        puntareanasProv.addPoint(390, 363);
        puntareanasProv.addPoint(374, 378);
        puntareanasProv.addPoint(383, 386);
        puntareanasProv.addPoint(388, 386);
        puntareanasProv.addPoint(392, 397);
        puntareanasProv.addPoint(394, 413);
        puntareanasProv.addPoint(390, 397);
        puntareanasProv.addPoint(382, 388);
        puntareanasProv.addPoint(363, 374);
        puntareanasProv.addPoint(370, 362);
        puntareanasProv.addPoint(356, 337);
        puntareanasProv.addPoint(341, 333);
        puntareanasProv.addPoint(341, 326);
        puntareanasProv.addPoint(330, 325);
        puntareanasProv.addPoint(317, 329);
        puntareanasProv.addPoint(324, 337);
        puntareanasProv.addPoint(324, 342);
        puntareanasProv.addPoint(342, 353);
        puntareanasProv.addPoint(344, 371);
        puntareanasProv.addPoint(322, 362);
        puntareanasProv.addPoint(309, 362);
        puntareanasProv.addPoint(289, 343);
        puntareanasProv.addPoint(292, 334);
        puntareanasProv.addPoint(299, 332);
        puntareanasProv.addPoint(303, 322);
        puntareanasProv.addPoint(300, 284);
        puntareanasProv.addPoint(283, 267);
        puntareanasProv.addPoint(258, 250);
        puntareanasProv.addPoint(234, 241);
        puntareanasProv.addPoint(233, 235);
        puntareanasProv.addPoint(201, 225);
        puntareanasProv.addPoint(186, 223);
        puntareanasProv.addPoint(171, 210);
        puntareanasProv.addPoint(169, 204);
        puntareanasProv.addPoint(174, 194);
        puntareanasProv.addPoint(162, 177);
        puntareanasProv.addPoint(159, 166);
        puntareanasProv.addPoint(147, 165);
        puntareanasProv.addPoint(121, 144);
        puntareanasProv.addPoint(121, 168);
        puntareanasProv.addPoint(133, 173);
        puntareanasProv.addPoint(135, 189);
        puntareanasProv.addPoint(131, 194);
        puntareanasProv.addPoint(124, 195);
        puntareanasProv.addPoint(122, 202);
        puntareanasProv.addPoint(114, 210);
        puntareanasProv.addPoint(112, 217);

        /*

        puntareanasProv.addPoint(111,216);
        puntareanasProv.addPoint(101,199);
        puntareanasProv.addPoint(105,181);
        puntareanasProv.addPoint(90,171);
        puntareanasProv.addPoint(107,165);
        puntareanasProv.addPoint(123,173);
        puntareanasProv.addPoint(133,174);
        puntareanasProv.addPoint(123,195);
        puntareanasProv.addPoint(133,185);
        puntareanasProv.addPoint(111,216);
        puntareanasProv.addPoint(372,362);
        puntareanasProv.addPoint(145,138);
        puntareanasProv.addPoint(149,122);
        puntareanasProv.addPoint(159,131);
        puntareanasProv.addPoint(166,128);
        puntareanasProv.addPoint(166,146);
        puntareanasProv.addPoint(178,163);
        puntareanasProv.addPoint(166,174);
        puntareanasProv.addPoint(178,184);
        puntareanasProv.addPoint(182,191);
        puntareanasProv.addPoint(177,193);
        puntareanasProv.addPoint(185,218);
        puntareanasProv.addPoint(203,219);
        puntareanasProv.addPoint(215,211);
        puntareanasProv.addPoint(276,261);
        puntareanasProv.addPoint(318,285);
        puntareanasProv.addPoint(328,250);
        puntareanasProv.addPoint(375,274);
        puntareanasProv.addPoint(414,298);
        puntareanasProv.addPoint(393,311);
        puntareanasProv.addPoint(389,324);
        puntareanasProv.addPoint(401,348);
        puntareanasProv.addPoint(372,377);
        puntareanasProv.addPoint(393,400);
        puntareanasProv.addPoint(365,373);
        puntareanasProv.addPoint(366,342);
        puntareanasProv.addPoint(340,325);
        puntareanasProv.addPoint(324,326);
        puntareanasProv.addPoint(325,325);
        puntareanasProv.addPoint(318,332);
        puntareanasProv.addPoint(343,369);
        puntareanasProv.addPoint(291,342);
        puntareanasProv.addPoint(313,297);
        puntareanasProv.addPoint(204,224);
        puntareanasProv.addPoint(170,212);
        puntareanasProv.addPoint(164,176);
        puntareanasProv.addPoint(133,153);
        puntareanasProv.addPoint(145,138);
*/
        //PUNTOS CARTAGO

        cartagoProv.addPoint(271,153);
        cartagoProv.addPoint(334,179);
        cartagoProv.addPoint(310,222);
        cartagoProv.addPoint(253,187);
        cartagoProv.addPoint(274,165);
        cartagoProv.addPoint(271,153);



    }

    public Polygon getHerediaProv() {
        return herediaProv;
    }

    public void setHerediaProv(Polygon herediaProv) {
        this.herediaProv = herediaProv;
    }

    public Polygon getSanJoseProv() {
        return sanJoseProv;
    }

    public void setSanJoseProv(Polygon sanJoseProv) {
        this.sanJoseProv = sanJoseProv;
    }

    public Polygon getAlajuelaProv() {
        return alajuelaProv;
    }

    public void setAlajuelaProv(Polygon alajuelaProv) {
        this.alajuelaProv = alajuelaProv;
    }

    public Polygon getCartagoProv() {
        return cartagoProv;
    }

    public void setCartagoProv(Polygon cartagoProv) {
        this.cartagoProv = cartagoProv;
    }

    public Polygon getGuanacasteProv() {
        return guanacasteProv;
    }

    public void setGuanacasteProv(Polygon guanacasteProv) {
        this.guanacasteProv = guanacasteProv;
    }

    public Polygon getLimonProv() {
        return limonProv;
    }

    public void setLimonProv(Polygon limonProv) {
        this.limonProv = limonProv;
    }

    public Polygon getPuntareanasProv() {
        return puntareanasProv;
    }

    public void setPuntareanasProv(Polygon puntareanasProv) {
        this.puntareanasProv = puntareanasProv;
    }
}
