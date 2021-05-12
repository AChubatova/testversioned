package Tiger01136

import Tiger01136.buildTypes.*
import Tiger01136.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01136")
    name = "Tiger01136"

    vcsRoot(Tiger01136_cVCSroot)

    buildType(Tiger01136_Hi0)
    buildType(Tiger01136_Hi1)
    buildType(Tiger01136_Hi2)
    buildType(Tiger01136_Hi3)
})
