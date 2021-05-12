package Tiger01148

import Tiger01148.buildTypes.*
import Tiger01148.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01148")
    name = "Tiger01148"

    vcsRoot(Tiger01148_cVCSroot)

    buildType(Tiger01148_Hi3)
    buildType(Tiger01148_Hi0)
    buildType(Tiger01148_Hi2)
    buildType(Tiger01148_Hi1)
})
