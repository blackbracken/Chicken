# Chicken: A crispy PUBG API wrapper for Kotlin :poultry_leg:

> i18nized readme is [here](https://github.com/blackbracken/Chicken/blob/master/README.md).

Chickenは、簡潔さと柔軟性を併せ持ったKotlinのためのPUBG APIラッパーです。

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
    
    // 例外が発生したときにnullを返すこともできます
    val nullablePlayer: Player? = nameRequest.completeOrNull()
    println(nullablePlayer?.name ?: "UNKNOWN_PLAYER")
}
```

## 目次
* [Chicken](#Chicken: A crispy PUBG API wrapper for Kotlin :poultry_leg:)
  * [ChickenClient](#ChickenClient)
  * [Submitted](#Submitted)

### ChickenClient

### Submitted