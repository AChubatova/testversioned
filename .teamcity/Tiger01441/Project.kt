package Tiger01441

import Tiger01441.buildTypes.*
import Tiger01441.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01441")
    name = "Tiger01441"

    vcsRoot(Tiger01441_cVCSroot)

    buildType(Tiger01441_Hi0)
    buildType(Tiger01441_Hi2)
    buildType(Tiger01441_Hi1)
    buildType(Tiger01441_Hi3)
})
