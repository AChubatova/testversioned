package Tiger01316

import Tiger01316.buildTypes.*
import Tiger01316.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01316")
    name = "Tiger01316"

    vcsRoot(Tiger01316_cVCSroot)

    buildType(Tiger01316_Hi3)
    buildType(Tiger01316_Hi2)
    buildType(Tiger01316_Hi1)
    buildType(Tiger01316_Hi0)
})
