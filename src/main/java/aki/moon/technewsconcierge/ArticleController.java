package aki.moon.technewsconcierge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @GetMapping("/articles/{id}")
    public Article article(@PathVariable String id){
        return new Article("ID",
                "2022/7/16(土) 11:00",
                "ワンキャリアのCTOが登壇するオンラインセミナー「CTOが特別解説！『サービススケールで直面した組織課題とマイクロサービスアーキテクチャ戦略』」が7月21日に開催",
                "翔泳社とCodeZineが主催する開発者向けイベント「Developers Summit 2022&amp;nbsp;Summer（デブサミ2022夏）」が7月21日にオンラインで開催されます。今年は「アジャイル・DevOps時代のプロダクトとエンジニア組織を支える、Developer Productivityへの道」をテーマとした34セッションを提供します。今回は「開発プロセス」のカテゴリからいくつかのセッションをご紹介します。",
                "http://codezine.jp/article/detail/16206");
    }
}
