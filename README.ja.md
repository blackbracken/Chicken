# Chicken: A crispy PUBG API wrapper for Kotlin :poultry_leg:

> i18nized readme is [here](https://github.com/blackbracken/Chicken/blob/master/README.md).

Chickenは、記述の簡潔さと柔軟性を併せ持ったKotlinのためのPUBG APIラッパーです。

公式ドキュメントは[PUBG DEVELOPERS API](https://developer.pubg.com/)、Chickenのドキュメントは[kdoc](https://bracken.black/Chicken/)を参照してください。

```kotlin
fun main(args: Array<String>) {
    val client = ChickenClient("your-api-key")
    val nameRequest = client.request(PlayerWithNameRequest(RegionShard.PC_NA, "shroud"))

    // 単純にプレイヤーの名前を表示します
    val player: Player = nameRequest.complete() // レスポンスが返ってくるまでコードは停滞します
    println(player.name) 
    
    // 簡単に非同期処理を行えます
    nameRequest.queue { queuedPlayer ->
        println(queuedPlayer.name) // レスポンスが返ってきてからこのスコープは実行されます、コードの進行はブロッキングされません
    }
    
    // 例外によって処理を切り替えることもできます
    nameRequest.queue(
        success = { queuedPlayer ->
            println(queuedPlayer.name)
        },
        failure = { throwable ->
            println("happened $throwable: ${throwable.message}")
        }
    )
    
    // モデルから値を抽出するキーを自分で作成することもできます
    // 例としてPlayerからhogeというStringを持つキーに対応したModelKeyを作成し, 拡張します
    player[PlayerKeys.NAME] // これは`player.name`の糖衣を外したもので等しい
    
    val originalHogeKey = SimpleModelKey<Player, String>("hoge")
    val ModelDealer<Player>.hoge
        get() = this[originalHogeKey]
        
    player.hoge // => String
}
```

<!--
## 目次
* [目次](#目次)
  * [Client](#Client)
  * [Request](#Request)
    * [FilteredPlayersRequest](#FilteredPlayersRequest)

### Client
`ChickenClient(apiKey: String)`によってこのAPIで用いるクライアントを生成できます。
`apiKey`は[公式サイト](https://developer.pubg.com/)から取得してください。

### Request
リクエストは`ChickenClient#request(Request<R>)`によって発行されます。
与えたリクエストによって得られると期待される型が`R`となります。

#### FilteredPlayersRequest
公式APIの[get_players](https://documentation.pubg.com/en/players-endpoint.html#/Players/get_players)に対応したリクエストです。

`FilteredPlayerRequest(RegionShard, filteredIdList: List<String>)`か`FilteredPlayerRequest(Region, filteredNameList: List<String>)`で生成します。
filteredIdListかfilteredNameListの**どちらかは空はでない**必要があります。

####
-->